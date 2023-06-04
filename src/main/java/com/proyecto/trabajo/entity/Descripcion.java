package com.proyecto.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Descripcion")
@Entity(name="descripcion")
public class Descripcion {
	@Id
	String codigo;
	String desayuno;
	String almuerzo;
	String cena;
	String bebidas;
	String extras;
	public Descripcion() {
		super();
	}
	public Descripcion(String codigo, String desayuno, String almuerzo, String cena, String bebidas, String extras) {
		super();
		this.codigo = codigo;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
		this.bebidas = bebidas;
		this.extras = extras;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	public String getAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}
	public String getCena() {
		return cena;
	}
	public void setCena(String cena) {
		this.cena = cena;
	}
	public String getBebidas() {
		return bebidas;
	}
	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	
	
	

}
