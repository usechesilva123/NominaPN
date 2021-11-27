package edu.co.software.smap.model;

import java.util.Collection;
import java.util.Date;

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

@Entity(name = "VACACIONES")
public class Vacaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int vacacionesDisfrutadasDias;
	@Column(unique = true, nullable = false)
	private int vacacionesDinero;
	@Column(unique = true, nullable = false)
	private Date fechaInicio;
	@Column(unique = true, nullable = false)
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name="empleado", referencedColumnName = "id", nullable = false)
	private Empleado empleado;	
	
	
	public Vacaciones() {
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
	 * @return the vacacionesDisfrutadasDias
	 */
	public int getVacacionesDisfrutadasDias() {
		return vacacionesDisfrutadasDias;
	}


	/**
	 * @param vacacionesDisfrutadasDias the vacacionesDisfrutadasDias to set
	 */
	public void setVacacionesDisfrutadasDias(int vacacionesDisfrutadasDias) {
		this.vacacionesDisfrutadasDias = vacacionesDisfrutadasDias;
	}


	/**
	 * @return the vacacionesDinero
	 */
	public int getVacacionesDinero() {
		return vacacionesDinero;
	}


	/**
	 * @param vacacionesDinero the vacacionesDinero to set
	 */
	public void setVacacionesDinero(int vacacionesDinero) {
		this.vacacionesDinero = vacacionesDinero;
	}


	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}


	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}


	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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

	
}
