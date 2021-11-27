package edu.co.software.smap.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity(name = "EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String razon_social;
	@Column(unique = true, nullable = false)
	private String documento;
	@Column(nullable = false)
	private String tipo_documento;
	@Column(nullable = false)
	private String descripcion;

    @ManyToMany(mappedBy = "empresas")
    private Collection<Usuario> users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	@JsonManagedReference
    private Collection<Empleado> empleados;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param razon_social
	 * @param documento
	 * @param tipo_documento
	 * @param descripcion
	 * @param users
	 * @param empleados
	 */
	public Empresa(int id, String razon_social, String documento, String tipo_documento, String descripcion,
			Collection<Usuario> users, Collection<Empleado> empleados) {
		super();
		this.id = id;
		this.razon_social = razon_social;
		this.documento = documento;
		this.tipo_documento = tipo_documento;
		this.descripcion = descripcion;
		this.users = users;
		this.empleados = empleados;
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
	 * @return the razon_social
	 */
	public String getRazon_social() {
		return razon_social;
	}

	/**
	 * @param razon_social the razon_social to set
	 */
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the tipo_documento
	 */
	public String getTipo_documento() {
		return tipo_documento;
	}

	/**
	 * @param tipo_documento the tipo_documento to set
	 */
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the users
	 */
	public Collection<Usuario> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Collection<Usuario> users) {
		this.users = users;
	}

	/**
	 * @return the empleados
	 */
	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	

}
