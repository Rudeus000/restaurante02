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

import com.proyecto.trabajo.entity.Personal;
import com.proyecto.trabajo.service.PersonalService;
@RestController
@RequestMapping

public class PersonalController {
	@Autowired
	PersonalService x;
	
	
	@GetMapping("/personal")
	public List<Personal>ver(){
		return x.ver();
	}
	@PostMapping("/personal")
	public Personal registrar(@RequestBody Personal a) {
		return x.registrar(a);
	}
	@PutMapping("/personal")
	public Personal actualizar(@RequestBody Personal a) {
		return x.actualizar(a);
	}
@DeleteMapping("/personal")
public  void eliminar(@RequestBody Personal a) {
	x.eliminar(a);
}
}
