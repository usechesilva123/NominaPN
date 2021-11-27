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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "DESCUENTO_EMPLEADO")
public class DescuentoEmpleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int salario;
	@Column(nullable = false)
	private int salud;
	@Column(nullable = false)
	private int pension;
	@Column(nullable = false)
	private int descuento_total;
	
	@ManyToOne
	@JoinColumn(name="empleado", referencedColumnName = "id", nullable = false)
	private Empleado empleado;
	
	public DescuentoEmpleado() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param id
	 * @param salario
	 * @param salud
	 * @param pension
	 * @param descuento_total
	 * @param empleado
	 */
	public DescuentoEmpleado(int id, int salario, int salud, int pension, int descuento_total, Empleado empleado) {
		super();
		this.id = id;
		this.salario = salario;
		this.salud = salud;
		this.pension = pension;
		this.descuento_total = descuento_total;
		this.empleado = empleado;
	}

	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * @return the pension
	 */
	public int getPension() {
		return pension;
	}

	/**
	 * @param pension the pension to set
	 */
	public void setPension(int pension) {
		this.pension = pension;
	}

	/**
	 * @return the descuento_total
	 */
	public int getDescuento_total() {
		return descuento_total;
	}

	/**
	 * @param descuento_total the descuento_total to set
	 */
	public void setDescuento_total(int descuento_total) {
		this.descuento_total = descuento_total;
	}

	/**
	 * @return the empleado
	 */
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	
}
