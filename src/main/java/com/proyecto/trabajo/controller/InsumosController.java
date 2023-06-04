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

import com.proyecto.trabajo.entity.Insumos;
import com.proyecto.trabajo.service.InsumosService;
@RestController
@RequestMapping

public class InsumosController {
	@Autowired
	InsumosService x;
	
	
	@GetMapping("/insumos")
	public List<Insumos>ver(){
		return x.ver();
	}
	@PostMapping("/insumos")
	public Insumos registrar(@RequestBody Insumos a) {
		return x.registrar(a);
	}
	@PutMapping("/insumos")
	public Insumos actualizar(@RequestBody Insumos a) {
		return x.actualizar(a);
	}
@DeleteMapping("/insumos")
public  void eliminar(@RequestBody Insumos a) {
	x.eliminar(a);
}
}
