package edu.co.software.smap.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "EMPLEADO")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String fecha_ingreso;
	@Column(nullable = false)
	private String cargo;
	
	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName = "id", nullable = false)
	@JsonBackReference
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="contrato", referencedColumnName = "id", nullable = false)
	private Contrato contrato;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param fecha_ingreso
	 * @param cargo
	 * @param empresa
	 * @param contrato
	 */
	public Empleado(int id, String nombre, String fecha_ingreso, String cargo, Empresa empresa, Contrato contrato) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.cargo = cargo;
		this.empresa = empresa;
		this.contrato = contrato;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fecha_ingreso
	 */
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	/**
	 * @param fecha_ingreso the fecha_ingreso to set
	 */
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the contrato
	 */
	public Contrato getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	

}
