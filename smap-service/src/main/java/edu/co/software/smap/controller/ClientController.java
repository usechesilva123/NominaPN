package edu.co.software.smap.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.co.software.smap.model.AuthenticationRequest;
import edu.co.software.smap.model.AuthenticationResponse;
import edu.co.software.smap.model.Contrato;
import edu.co.software.smap.model.Empleado;
import edu.co.software.smap.model.Empresa;
import edu.co.software.smap.model.TipoContrato;
import edu.co.software.smap.model.Usuario;
import edu.co.software.smap.service.ContratoService;
import edu.co.software.smap.service.EmpleadoService;
import edu.co.software.smap.service.EmpresaService;
import edu.co.software.smap.service.TipoContratoService;
import edu.co.software.smap.service.UsuarioService;
import edu.co.software.smap.utils.JwtUtil;

@RestController
@RequestMapping(value = "/client")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST,
		RequestMethod.OPTIONS }, allowedHeaders = "*")
public class ClientController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ClientController.class);

	@Autowired
	private EmpresaService empresaService;

	@Autowired
	private EmpleadoService empleadoService;

	@Autowired
	private ContratoService contratoService;

	@Autowired
	private TipoContratoService tipoContratoService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/cargarArchivo")
	public Empresa procesarArchivo(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws Exception {

		final String authorizationHeader = request.getHeader("Authorization");		
		String username = null;
		String jwt = null;		
		if(authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			jwt = authorizationHeader.substring(7);
			username = jwtUtil.extractUsername(jwt);
		}
		Usuario user = usuarioService.findByUser(username);
		log.info(user.getEmpresas().toString());
		
		List<Empleado> tempStudentList = new ArrayList<Empleado>();
	    XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    
	    XSSFRow row = worksheet.getRow(3);
	    Empresa empresa = new Empresa(0,row.getCell(3).getStringCellValue(),
	    		(int)row.getCell(2).getNumericCellValue() + "", row.getCell(1).getStringCellValue(),
	    		null, null, null);
	    
	   boolean valido = false;
	    
	    for(Empresa disponibles : user.getEmpresas()) {
	    	if(disponibles.getDocumento().equalsIgnoreCase(empresa.getDocumento())&&
	    			disponibles.getTipo_documento().equalsIgnoreCase(empresa.getTipo_documento())&&
	    					disponibles.getRazon_social().equalsIgnoreCase(empresa.getRazon_social())) {
	    		valido = true;
	    		empresa = disponibles;
	    		break;
	    		}

		    log.info(disponibles.getDocumento().equalsIgnoreCase(empresa.getDocumento()) + "");
		    log.info(disponibles.getTipo_documento().equalsIgnoreCase(empresa.getTipo_documento()) + "");
		    log.info(disponibles.getRazon_social().equalsIgnoreCase(empresa.getRazon_social()) + "");
	    		
	    }
	    
	    if(valido) {
	    	  for(int i=6;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	    		  
	    	        Empleado empleado = new Empleado();
	    	            
	    	        XSSFRow fila = worksheet.getRow(i);
	    	            
	    	        empleado.setCargo(fila.getCell(4).getStringCellValue());
	    	        empleado.setFecha_ingreso(fila.getCell(12).getNumericCellValue()+"");
	    	        empleado.setNombre(fila.getCell(3).getStringCellValue());
	    	        
	    	 	    boolean encontrado = false;
	    	        for(Empleado disponibles : empleadoService.fetch()) {
	    	        	if(disponibles.getNombre().equalsIgnoreCase(empleado.getNombre())) {
	    	        		encontrado = true;
	    	        		break;
	    	        	}
	    	        }
	    	        if(!encontrado) {
	    	        	TipoContrato tipoContrato = new TipoContrato(0, "INDEFINIDO", "INDEFINIDO");

		    	 	    encontrado = false;
		    	        for(TipoContrato disponibles : tipoContratoService.fetch()) {
		    	        	if(disponibles.getTermino().equalsIgnoreCase(tipoContrato.getTermino())) {
		    	        		encontrado = true;
		    	        		tipoContrato = disponibles;
		    		    		break;
		    	        	}
		    	        }
		    	        if(!encontrado)
		    	        	tipoContratoService.save(tipoContrato);
		    	        
	    	        	Contrato contratoEmp = new Contrato(0, 
		    	        		(int) fila.getCell(13).getNumericCellValue(), 
		    	        		new Date(), new Date(), "", tipoContrato);
		    	        contratoEmp = contratoService.save(contratoEmp);
		    	        empleado.setContrato(contratoEmp);
		    	        empleado.setEmpresa(empresa);
	    	        	empleadoService.save(empleado);
	    	        }
	    	    }
	    	
	    }
//        
//        tempStudent.setId((int) row.getCell(0).getNumericCellValue());
//        tempStudent.setContent(row.getCell(1).getStringCellValue());
		
		return user.getEmpresas().iterator().next();


//		Radicado radicado = new Radicado();
//		radicado.setComentario(comment);
//		radicado.setTipo(tipoService.findByName(tipo));
//		radicado.setEstado(estadoService.findByName(estado));
//		radicado.setFecha(new Date(System.currentTimeMillis()));
//		radicado.setUsuario(user);
//		radicado.setAnexo("");
//		radicado.setNumero_radicado(0);
//		//Para obtener el id de radicado válido
//		radicado = radicadoService.saveRadicado(radicado);
//		radicado.setNumero_radicado((int)radicado.getId()+9900);
//
//		String fileName = fileStorageService.storeFile(file, radicado.getNumero_radicado()+".pdf");
//
//		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//				.path("/downloadFile/")
//				.path(fileName)
//				.toUriString();
//
//
//		radicado.setAnexo(fileDownloadUri);
//
//		radicado = radicadoService.saveRadicado(radicado);
//
//		return radicado;
		//		return new UploadFileResponse(fileName, fileDownloadUri,
		//				file.getContentType(), file.getSize());
	}
//
//
//	@GetMapping("/downloadFile/{fileName:.+}")
//	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) throws Exception {
//		// Load file as Resource
//		Resource resource = fileStorageService.loadFileAsResource(fileName);
//
//		// Try to determine file's content type
//		String contentType = null;
//		try {
//			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//		} catch (IOException ex) {
//			logger.info("Could not determine file type.");
//		}
//
//		// Fallback to the default content type if type could not be determined
//		if(contentType == null) {
//			contentType = "application/octet-stream";
//		}
//
//		return ResponseEntity.ok()
//				.contentType(MediaType.parseMediaType(contentType))
//				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//				.body(resource);
//	}



}
