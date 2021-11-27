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
import edu.co.software.smap.repository.EmpleadoRepository;
import edu.co.software.smap.service.EmpleadoService;
import edu.co.software.smap.model.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(EmpleadoServiceImpl.class);

	@Autowired
	EmpleadoRepository empleadoRepository;

	@Override
	public Empleado save(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public List<Empleado> fetch() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public void delete(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepository.delete(empleado);
	}
	

}
