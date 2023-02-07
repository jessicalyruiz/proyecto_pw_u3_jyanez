package com.example.demo.Service;

import com.example.demo.modelo.Profesor;

public interface IProfesorService {

	public void registrar(Profesor profesor);
	public void actualizar(Profesor profesor);
	public Profesor encontrar(Integer id);
	public void borrar(Integer id);
	public Profesor buscarNombre(String nombre);
	public Profesor buscarApellido(String apellido);
	public Profesor buscarCedula(String cedula);
}
