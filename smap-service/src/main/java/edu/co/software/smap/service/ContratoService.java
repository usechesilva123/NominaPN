package edu.co.software.smap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.co.software.smap.model.Contrato;

@Service
public interface ContratoService {
	
	Contrato save(Contrato contrato);

	List<Contrato> fetch();
	
	void delete(Contrato contrato);

}
