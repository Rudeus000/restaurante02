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

import com.proyecto.trabajo.entity.Mesa;
import com.proyecto.trabajo.service.MesaService;
@RestController
@RequestMapping

public class MesaController {
	@Autowired
	MesaService x;
	
	
	@GetMapping("/mesa")
	public List<Mesa>ver(){
		return x.ver();
	}
	@PostMapping("/mesa")
	public Mesa registrar(@RequestBody Mesa a) {
		return x.registrar(a);
	}
	@PutMapping("/mesa")
	public Mesa actualizar(@RequestBody Mesa a) {
		return x.actualizar(a);
	}
@DeleteMapping("/mesa")
public  void eliminar(@RequestBody Mesa a) {
	x.eliminar(a);
}
}
