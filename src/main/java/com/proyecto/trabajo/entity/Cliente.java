package com.proyecto.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Cliente")
@Entity(name="cliente")
public class Cliente {
@Id
	String ruc;
	String dni;
	public Cliente() {
		super();
	}
	public Cliente(String ruc, String dni) {
		super();
		this.ruc = ruc;
		this.dni = dni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
