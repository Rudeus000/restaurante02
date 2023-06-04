package com.proyecto.trabajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.proyecto.trabajo.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,String>{
	
}
