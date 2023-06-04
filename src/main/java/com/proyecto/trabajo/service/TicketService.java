package com.proyecto.trabajo.service;

import java.util.List;
import com.proyecto.trabajo.entity.Ticket;

public interface TicketService {
	
	public Ticket registrar(Ticket a);
	public Ticket actualizar(Ticket a);
	public void eliminar(Ticket a);
	public List<Ticket> ver();


}
