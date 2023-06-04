package com.proyecto.trabajo.service;
import java.util.List;
import com.proyecto.trabajo.entity.Cliente;

public interface ClienteService {
	
	public Cliente registrar(Cliente a);
	public Cliente actualizar(Cliente a);
	public void eliminar(Cliente a);
	public List <Cliente>ver();

}
