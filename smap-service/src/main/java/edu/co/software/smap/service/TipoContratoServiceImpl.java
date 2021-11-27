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
import edu.co.software.smap.repository.TipoContratoRepository;
import edu.co.software.smap.service.TipoContratoService;
import edu.co.software.smap.model.TipoContrato;

@Service
public class TipoContratoServiceImpl implements TipoContratoService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(TipoContratoServiceImpl.class);

	@Autowired
	TipoContratoRepository tipoRepository;

	@Override
	public TipoContrato save(TipoContrato tipo) {
		return tipoRepository.save(tipo);
	}

	@Override
	public List<TipoContrato> fetch() {
		// TODO Auto-generated method stub
		return tipoRepository.findAll();
	}

	@Override
	public void delete(TipoContrato tipo) {
		// TODO Auto-generated method stub
		tipoRepository.delete(tipo);
	}
	

}
