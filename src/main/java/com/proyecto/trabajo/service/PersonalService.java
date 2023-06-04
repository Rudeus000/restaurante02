package com.proyecto.trabajo.service;

import java.util.List;
import com.proyecto.trabajo.entity.Personal;

public interface PersonalService {
	
	public Personal registrar(Personal a);
	public Personal actualizar(Personal a);
	public void eliminar(Personal a);
	public List <Personal>ver();


}
