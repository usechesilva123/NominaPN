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
import edu.co.software.smap.repository.ContratoRepository;
import edu.co.software.smap.service.ContratoService;
import edu.co.software.smap.model.Contrato;

@Service
public class ContratoServiceImpl implements ContratoService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ContratoServiceImpl.class);

	@Autowired
	ContratoRepository contratoRepository;

	@Override
	public Contrato save(Contrato contrato) {
		return contratoRepository.save(contrato);
	}

	@Override
	public List<Contrato> fetch() {
		// TODO Auto-generated method stub
		return contratoRepository.findAll();
	}

	@Override
	public void delete(Contrato contrato) {
		// TODO Auto-generated method stub
		contratoRepository.delete(contrato);
	}
	

}
