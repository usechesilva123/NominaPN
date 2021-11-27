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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class UsuarioRequest {

	private int id;
	private String nombre_completo;
	private String documento;
	private String telefono;
	private String email;
	private String tipo_documento;
	private String password;
	private boolean enabled;
	
	private Collection<Empresa> empresas;

	public UsuarioRequest() {}

	/**
	 * @param id
	 * @param nombre_completo
	 * @param documento
	 * @param telefono
	 * @param email
	 * @param tipo_documento
	 * @param password
	 * @param enabled
	 * @param empresas
	 */
	public UsuarioRequest(int id, String nombre_completo, String documento, String telefono, String email,
			String tipo_documento, String password, boolean enabled, Collection<Empresa> empresas) {
		super();
		this.id = id;
		this.nombre_completo = nombre_completo;
		this.documento = documento;
		this.telefono = telefono;
		this.email = email;
		this.tipo_documento = tipo_documento;
		this.password = password;
		this.enabled = enabled;
		this.empresas = empresas;
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
	 * @return the nombre_completo
	 */
	public String getNombre_completo() {
		return nombre_completo;
	}

	/**
	 * @param nombre_completo the nombre_completo to set
	 */
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the empresas
	 */
	public Collection<Empresa> getEmpresas() {
		return empresas;
	}

	/**
	 * @param empresas the empresas to set
	 */
	public void setEmpresas(Collection<Empresa> empresas) {
		this.empresas = empresas;
	}

	
}
