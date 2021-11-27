package edu.co.software.smap.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.co.software.smap.model.TipoContrato;

public interface TipoContratoRepository extends JpaRepository<TipoContrato, Integer> { 

}
