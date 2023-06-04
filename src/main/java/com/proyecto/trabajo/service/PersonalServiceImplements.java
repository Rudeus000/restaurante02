package com.proyecto.trabajo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.trabajo.entity.Personal;
import com.proyecto.trabajo.repository.PersonalRepository;
@Service
public class PersonalServiceImplements implements PersonalService {
	@Autowired
	PersonalRepository x;

	@Override
	public Personal registrar(Personal a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Personal actualizar(Personal a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Personal a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Personal> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
	

}
