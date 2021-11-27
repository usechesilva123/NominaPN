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

@Entity(name = "SALARIO_PAGO")
public class SalarioPago {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int descuentosTotales;
	@Column(nullable = false)
	private int diaTrabajado;
	@Column(nullable = false)
	private int diaIncapacidad;
	@Column(nullable = false)
	private int diaLicencia;
	@Column(nullable = false)
	private int auxilioTransporte;
	@Column(nullable = false)
	private int salarioSinDescuentos;
	@Column(nullable = false)
	private int salarioTotal;

	@ManyToOne
	@JoinColumn(name="empleado", referencedColumnName = "id", nullable = false)
	private Empleado empleado;

	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName = "id", nullable = false)
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name="descuento", referencedColumnName = "id", nullable = false)
	private DescuentoEmpleado descuento;

	@ManyToOne
	@JoinColumn(name="horasExtras", referencedColumnName = "id", nullable = false)
	private HorasExtras horasExtras;
	
	public SalarioPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param descuentosTotales
	 * @param diaTrabajado
	 * @param diaIncapacidad
	 * @param diaLicencia
	 * @param auxilioTransporte
	 * @param salarioSinDescuentos
	 * @param salarioTotal
	 * @param empleado
	 * @param empresa
	 * @param descuento
	 * @param horasExtras
	 */
	public SalarioPago(int id, int descuentosTotales, int diaTrabajado, int diaIncapacidad, int diaLicencia,
			int auxilioTransporte, int salarioSinDescuentos, int salarioTotal, Empleado empleado, Empresa empresa,
			DescuentoEmpleado descuento, HorasExtras horasExtras) {
		super();
		this.id = id;
		this.descuentosTotales = descuentosTotales;
		this.diaTrabajado = diaTrabajado;
		this.diaIncapacidad = diaIncapacidad;
		this.diaLicencia = diaLicencia;
		this.auxilioTransporte = auxilioTransporte;
		this.salarioSinDescuentos = salarioSinDescuentos;
		this.salarioTotal = salarioTotal;
		this.empleado = empleado;
		this.empresa = empresa;
		this.descuento = descuento;
		this.horasExtras = horasExtras;
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
	 * @return the descuentosTotales
	 */
	public int getDescuentosTotales() {
		return descuentosTotales;
	}

	/**
	 * @param descuentosTotales the descuentosTotales to set
	 */
	public void setDescuentosTotales(int descuentosTotales) {
		this.descuentosTotales = descuentosTotales;
	}

	/**
	 * @return the diaTrabajado
	 */
	public int getDiaTrabajado() {
		return diaTrabajado;
	}

	/**
	 * @param diaTrabajado the diaTrabajado to set
	 */
	public void setDiaTrabajado(int diaTrabajado) {
		this.diaTrabajado = diaTrabajado;
	}

	/**
	 * @return the diaIncapacidad
	 */
	public int getDiaIncapacidad() {
		return diaIncapacidad;
	}

	/**
	 * @param diaIncapacidad the diaIncapacidad to set
	 */
	public void setDiaIncapacidad(int diaIncapacidad) {
		this.diaIncapacidad = diaIncapacidad;
	}

	/**
	 * @return the diaLicencia
	 */
	public int getDiaLicencia() {
		return diaLicencia;
	}

	/**
	 * @param diaLicencia the diaLicencia to set
	 */
	public void setDiaLicencia(int diaLicencia) {
		this.diaLicencia = diaLicencia;
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
	 * @return the salarioSinDescuentos
	 */
	public int getSalarioSinDescuentos() {
		return salarioSinDescuentos;
	}

	/**
	 * @param salarioSinDescuentos the salarioSinDescuentos to set
	 */
	public void setSalarioSinDescuentos(int salarioSinDescuentos) {
		this.salarioSinDescuentos = salarioSinDescuentos;
	}

	/**
	 * @return the salarioTotal
	 */
	public int getSalarioTotal() {
		return salarioTotal;
	}

	/**
	 * @param salarioTotal the salarioTotal to set
	 */
	public void setSalarioTotal(int salarioTotal) {
		this.salarioTotal = salarioTotal;
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
	 * @return the descuento
	 */
	public DescuentoEmpleado getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(DescuentoEmpleado descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the horasExtras
	 */
	public HorasExtras getHorasExtras() {
		return horasExtras;
	}

	/**
	 * @param horasExtras the horasExtras to set
	 */
	public void setHorasExtras(HorasExtras horasExtras) {
		this.horasExtras = horasExtras;
	}

	
}
