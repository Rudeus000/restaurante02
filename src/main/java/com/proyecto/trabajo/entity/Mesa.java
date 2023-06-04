package com.proyecto.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Mesa")
@Entity(name="mesa")

public class Mesa {
	@Id
	String n_de_mesa;
	String mesa_disponible;
	public Mesa() {
		super();
	}
	public Mesa(String n_de_mesa, String mesa_disponible) {
		super();
		this.n_de_mesa = n_de_mesa;
		this.mesa_disponible = mesa_disponible;
	}
	public String getN_de_mesa() {
		return n_de_mesa;
	}
	public void setN_de_mesa(String n_de_mesa) {
		this.n_de_mesa = n_de_mesa;
	}
	public String getMesa_disponible() {
		return mesa_disponible;
	}
	public void setMesa_disponible(String mesa_disponible) {
		this.mesa_disponible = mesa_disponible;
	}
	

}
