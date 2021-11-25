package edu.co.software.smap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.co.software.smap.model.Empresa;

@Service
public interface EmpresaService {
	
	Empresa save(Empresa empresa);

	List<Empresa> fetch();
	
	void delete(Empresa empresa);

}
