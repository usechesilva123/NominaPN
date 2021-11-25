package edu.co.software.smap.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.co.software.smap.model.Role;
import edu.co.software.smap.repository.EmpresaRepository;
import edu.co.software.smap.service.EmpresaService;
import edu.co.software.smap.model.Empresa;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	EmpresaRepository empresaRepository;

	@Override
	public Empresa save(Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	@Override
	public List<Empresa> fetch() {
		// TODO Auto-generated method stub
		return empresaRepository.findAll();
	}

	@Override
	public void delete(Empresa empresa) {
		// TODO Auto-generated method stub
		empresaRepository.delete(empresa);
	}
	

}
