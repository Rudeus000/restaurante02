package com.proyecto.trabajo.service;

import java.util.List;
import com.proyecto.trabajo.entity.Insumos;

public interface InsumosService {
	
	public Insumos registrar(Insumos a);
	public Insumos actualizar(Insumos a);
	public void eliminar(Insumos a);
	public List <Insumos>ver();


}
