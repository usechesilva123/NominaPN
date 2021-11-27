package edu.co.software.smap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.co.software.smap.model.TipoContrato;

@Service
public interface TipoContratoService {
	
	TipoContrato save(TipoContrato tipoContrato);

	List<TipoContrato> fetch();
	
	void delete(TipoContrato tipoContrato);

}
