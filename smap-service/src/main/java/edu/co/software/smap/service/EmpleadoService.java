package edu.co.software.smap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.co.software.smap.model.Empleado;

@Service
public interface EmpleadoService {
	
	Empleado save(Empleado empleado);

	List<Empleado> fetch();
	
	void delete(Empleado empleado);

}
