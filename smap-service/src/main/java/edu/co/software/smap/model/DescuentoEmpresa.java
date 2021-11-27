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

@Entity(name = "DESCUENTO_EMPRESA")
public class DescuentoEmpresa {
	
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
	private int ARL;
	@Column(nullable = false)
	private int sena;
	@Column(nullable = false)
	private int ICBF;
	@Column(nullable = false)
	private int auxilioTransporte;
	
	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName = "id", nullable = false)
	private Empresa empresa;
	
	public DescuentoEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param salario
	 * @param salud
	 * @param pension
	 * @param aRL
	 * @param sena
	 * @param iCBF
	 * @param auxilioTransporte
	 * @param empresa
	 */
	public DescuentoEmpresa(int id, int salario, int salud, int pension, int aRL, int sena, int iCBF,
			int auxilioTransporte, Empresa empresa) {
		super();
		this.id = id;
		this.salario = salario;
		this.salud = salud;
		this.pension = pension;
		ARL = aRL;
		this.sena = sena;
		ICBF = iCBF;
		this.auxilioTransporte = auxilioTransporte;
		this.empresa = empresa;
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
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
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
	 * @return the aRL
	 */
	public int getARL() {
		return ARL;
	}

	/**
	 * @param aRL the aRL to set
	 */
	public void setARL(int aRL) {
		ARL = aRL;
	}

	/**
	 * @return the sena
	 */
	public int getSena() {
		return sena;
	}

	/**
	 * @param sena the sena to set
	 */
	public void setSena(int sena) {
		this.sena = sena;
	}

	/**
	 * @return the iCBF
	 */
	public int getICBF() {
		return ICBF;
	}

	/**
	 * @param iCBF the iCBF to set
	 */
	public void setICBF(int iCBF) {
		ICBF = iCBF;
	}

	/**
	 * @return the auxilioTransporte
	 */
	public int getAuxilioTransporte() {
		return auxilioTransporte;
	}

	/**
	 * @param auxilioTransporte the auxilioTransporte to set
	 */
	public void setAuxilioTransporte(int auxilioTransporte) {
		this.auxilioTransporte = auxilioTransporte;
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

	
}
