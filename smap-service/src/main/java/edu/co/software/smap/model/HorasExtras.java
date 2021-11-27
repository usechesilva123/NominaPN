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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "HORAS_EXTRAS")
public class HorasExtras {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int HED;
	@Column(nullable = false)
	private int HEN;
	@Column(nullable = false)
	private int HFD;
	@Column(nullable = false)
	private int HFN;
	
	public HorasExtras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HorasExtras(int id, int hED, int hEN, int hFD, int hFN) {
		super();
		this.id = id;
		HED = hED;
		HEN = hEN;
		HFD = hFD;
		HFN = hFN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHED() {
		return HED;
	}

	public void setHED(int hED) {
		HED = hED;
	}

	public int getHEN() {
		return HEN;
	}

	public void setHEN(int hEN) {
		HEN = hEN;
	}

	public int getHFD() {
		return HFD;
	}

	public void setHFD(int hFD) {
		HFD = hFD;
	}

	public int getHFN() {
		return HFN;
	}

	public void setHFN(int hFN) {
		HFN = hFN;
	}

	
}
