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
import edu.co.software.smap.service.EmpresaService;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST,
		RequestMethod.OPTIONS }, allowedHeaders = "*")
public class AdminController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private EmpresaService empresaService;
	
	@RequestMapping(value = "/empresa", method = RequestMethod.POST)
	public Empresa save(@RequestBody Empresa empresa) {
		return empresaService.save(empresa);
	}
	
	@RequestMapping(value = "/empresa", method = RequestMethod.GET)
	public List<Empresa> find() {
		return empresaService.fetch();
	}
	
	@RequestMapping(value = "/empresa", method = RequestMethod.DELETE)
	public void delete(@RequestBody Empresa empresa) {
		empresaService.delete(empresa);
	}


}
