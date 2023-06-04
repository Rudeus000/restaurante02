package com.proyecto.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Insumos")
@Entity(name="insumos")

public class Insumos {
	@Id
String codigo;
String insumos;
String tipo;
public Insumos() {
	super();
}
public Insumos(String codigo, String insumos, String tipo) {
	super();
	this.codigo = codigo;
	this.insumos = insumos;
	this.tipo = tipo;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getInsumos() {
	return insumos;
}
public void setInsumos(String insumos) {
	this.insumos = insumos;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
