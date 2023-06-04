package com.proyecto.trabajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.proyecto.trabajo.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal,String>{
	
}
