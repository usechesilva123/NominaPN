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

@Entity(name = "CONTRATO")
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int salario;
	@Column(nullable = false)
	private Date horarioDeEntrada;
	@Column(nullable = false)
	private Date horarioDeSalida;
	@Column(nullable = false)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="tipo", referencedColumnName = "id", nullable = false)
	private TipoContrato tipo;
	
	public Contrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrato(int id, int salario, Date horarioDeEntrada, Date horarioDeSalida, String descripcion,
			TipoContrato tipo) {
		super();
		this.id = id;
		this.salario = salario;
		this.horarioDeEntrada = horarioDeEntrada;
		this.horarioDeSalida = horarioDeSalida;
		this.descripcion = descripcion;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Date getHorarioDeEntrada() {
		return horarioDeEntrada;
	}

	public void setHorarioDeEntrada(Date horarioDeEntrada) {
		this.horarioDeEntrada = horarioDeEntrada;
	}

	public Date getHorarioDeSalida() {
		return horarioDeSalida;
	}

	public void setHorarioDeSalida(Date horarioDeSalida) {
		this.horarioDeSalida = horarioDeSalida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}
	
	


}
