package com.proyecto.trabajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.trabajo.entity.Ticket;
import com.proyecto.trabajo.service.TicketService;
@RestController
@RequestMapping

public class TicketController {
	@Autowired
	TicketService x;
	
	
	@GetMapping("/ticket")
	public List<Ticket>ver(){
		return x.ver();
	}
	@PostMapping("/ticket")
	public Ticket registrar(@RequestBody Ticket a) {
		return x.registrar(a);
	}
	@PutMapping("/ticket")
	public Ticket actualizar(@RequestBody Ticket a) {
		return x.actualizar(a);
	}
@DeleteMapping("/ticket")
public  void eliminar(@RequestBody Ticket a) {
	x.eliminar(a);
}
}

