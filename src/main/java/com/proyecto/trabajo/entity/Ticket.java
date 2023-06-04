package com.proyecto.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table (name="Ticket")
@Entity(name="ticket")

public class Ticket {
	@Id
 int importe_total;
 String ruc;
public Ticket() {
	super();
}
public Ticket(int importe_total, String ruc) {
	super();
	this.importe_total = importe_total;
	this.ruc = ruc;
}
public int getImporte_total() {
	return importe_total;
}
public void setImporte_total(int importe_total) {
	this.importe_total = importe_total;
}
public String getRuc() {
	return ruc;
}
public void setRuc(String ruc) {
	this.ruc = ruc;
}
 
}
