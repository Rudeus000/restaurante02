package com.proyecto.trabajo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.trabajo.entity.Ticket;
import com.proyecto.trabajo.repository.TicketRepository;

@Service
public class TicketServiceImplments  implements TicketService {
	@Autowired
	TicketRepository x;

	@Override
	public Ticket registrar(Ticket a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ticket actualizar(Ticket a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ticket a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Ticket> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
