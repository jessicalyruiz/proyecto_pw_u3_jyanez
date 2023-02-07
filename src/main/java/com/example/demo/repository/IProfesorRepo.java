package com.example.demo.repository;

import com.example.demo.modelo.Profesor;

public interface IProfesorRepo {

	public void insertar(Profesor profesor);
	public void actualizar(Profesor profesor);
	public Profesor buscar(Integer id);
	public void eliminar(Integer id);
	public Profesor buscarNombre(String nombre);
	public Profesor buscarApellido(String apellido);
	public Profesor buscarCedula(String cedula);
}
