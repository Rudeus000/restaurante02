package com.proyecto.trabajo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.trabajo.entity.Insumos;
import com.proyecto.trabajo.repository.InsumosRepository;
@Service
public class InsumosServiceImplements  implements InsumosService{
	@Autowired
	InsumosRepository x;

	@Override
	public Insumos registrar(Insumos a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Insumos actualizar(Insumos a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Insumos a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Insumos> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
