package com.proyecto.trabajo.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.proyecto.trabajo.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,String>{
	
}


