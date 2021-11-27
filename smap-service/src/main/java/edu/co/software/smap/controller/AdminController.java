package edu.co.software.smap.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.co.software.smap.model.AuthenticationRequest;
import edu.co.software.smap.model.AuthenticationResponse;
import edu.co.software.smap.model.Empresa;
import edu.co.software.smap.model.Usuario;
import edu.co.software.smap.model.UsuarioRequest;
import edu.co.software.smap.service.EmpresaService;
import edu.co.software.smap.service.UsuarioService;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST,
		RequestMethod.OPTIONS }, allowedHeaders = "*")
public class AdminController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private EmpresaService empresaService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/empresa", method = RequestMethod.POST)
	public Empresa saveEmpresa(@RequestBody Empresa empresa) {
		return empresaService.save(empresa);
	}
	
	@RequestMapping(value = "/empresa", method = RequestMethod.GET)
	public List<Empresa> findEmpresa() {
		return empresaService.fetch();
	}
	
	@RequestMapping(value = "/empresa", method = RequestMethod.DELETE)
	public void deleteEmpresa(@RequestBody Empresa empresa) {
		empresaService.delete(empresa);
	}
	
	@RequestMapping(value = "/usuario/client", method = RequestMethod.POST)
	public Usuario saveUsuarioCliente(@RequestBody UsuarioRequest usuario) {
		Usuario user = new Usuario(usuario.getNombre_completo(),usuario.getDocumento(),usuario.getTelefono()
				, usuario.getEmail(), usuario.getTipo_documento(), usuario.getPassword(), usuario.isEnabled());
		user.setEmpresas(usuario.getEmpresas());
		return usuarioService.saveClient(user);
	}
	
	@RequestMapping(value = "/usuario/admin", method = RequestMethod.POST)
	public Usuario saveUsuarioAdmin(@RequestBody Usuario usuario) {
		return usuarioService.saveAdmin(usuario);
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<Usuario> findUsuario() {
		return usuarioService.fetch();
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.DELETE)
	public void deleteUsuario(@RequestBody Usuario usuario) {
		usuarioService.delete(usuario);
	}


}
