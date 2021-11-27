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

@Entity(name = "ESTADO_SALUD_EMPLEADO")
public class SituacionSaludEmpleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String estado;
	@Column(unique = true, nullable = false)
	private int montoPago;
	@Column(unique = true, nullable = false)
	private int pagoObligatorio;
	@Column(unique = true, nullable = false)
	private int diferencia;
	@Column(unique = true, nullable = false)
	private int salario;
	@Column(unique = true, nullable = false)
	private int tarifa;
	@Column(unique = true, nullable = false)
	private int IBCEmpleado;
	@Column(unique = true, nullable = false)
	private Date fechaPago;
	
	@ManyToOne
	@JoinColumn(name="empleado", referencedColumnName = "id", nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName = "id", nullable = false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="descuentoEmpleado", referencedColumnName = "id", nullable = false)
	private DescuentoEmpleado descuento;
	
	@ManyToOne
	@JoinColumn(name="salarioPagar", referencedColumnName = "id", nullable = false)
	private SalarioPago salarioPago;
	
	
	
	public SituacionSaludEmpleado() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param id
	 * @param estado
	 * @param montoPago
	 * @param pagoObligatorio
	 * @param diferencia
	 * @param salario
	 * @param tarifa
	 * @param iBCEmpleado
	 * @param fechaPago
	 * @param empleado
	 * @param empresa
	 * @param descuento
	 * @param salarioPago
	 */
	public SituacionSaludEmpleado(int id, String estado, int montoPago, int pagoObligatorio, int diferencia,
			int salario, int tarifa, int iBCEmpleado, Date fechaPago, Empleado empleado, Empresa empresa,
			DescuentoEmpleado descuento, SalarioPago salarioPago) {
		super();
		this.id = id;
		this.estado = estado;
		this.montoPago = montoPago;
		this.pagoObligatorio = pagoObligatorio;
		this.diferencia = diferencia;
		this.salario = salario;
		this.tarifa = tarifa;
		IBCEmpleado = iBCEmpleado;
		this.fechaPago = fechaPago;
		this.empleado = empleado;
		this.empresa = empresa;
		this.descuento = descuento;
		this.salarioPago = salarioPago;
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}



	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}



	/**
	 * @return the montoPago
	 */
	public int getMontoPago() {
		return montoPago;
	}



	/**
	 * @param montoPago the montoPago to set
	 */
	public void setMontoPago(int montoPago) {
		this.montoPago = montoPago;
	}



	/**
	 * @return the pagoObligatorio
	 */
	public int getPagoObligatorio() {
		return pagoObligatorio;
	}



	/**
	 * @param pagoObligatorio the pagoObligatorio to set
	 */
	public void setPagoObligatorio(int pagoObligatorio) {
		this.pagoObligatorio = pagoObligatorio;
	}



	/**
	 * @return the diferencia
	 */
	public int getDiferencia() {
		return diferencia;
	}



	/**
	 * @param diferencia the diferencia to set
	 */
	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
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
	 * @return the tarifa
	 */
	public int getTarifa() {
		return tarifa;
	}



	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}



	/**
	 * @return the iBCEmpleado
	 */
	public int getIBCEmpleado() {
		return IBCEmpleado;
	}



	/**
	 * @param iBCEmpleado the iBCEmpleado to set
	 */
	public void setIBCEmpleado(int iBCEmpleado) {
		IBCEmpleado = iBCEmpleado;
	}



	/**
	 * @return the fechaPago
	 */
	public Date getFechaPago() {
		return fechaPago;
	}



	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
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
	 * @return the salarioPago
	 */
	public SalarioPago getSalarioPago() {
		return salarioPago;
	}



	/**
	 * @param salarioPago the salarioPago to set
	 */
	public void setSalarioPago(SalarioPago salarioPago) {
		this.salarioPago = salarioPago;
	}

}
