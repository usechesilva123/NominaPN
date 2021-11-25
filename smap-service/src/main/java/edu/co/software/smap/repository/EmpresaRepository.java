package edu.co.software.smap.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.co.software.smap.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> { 

}
