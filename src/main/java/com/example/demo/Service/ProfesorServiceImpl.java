package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Profesor;
import com.example.demo.repository.IProfesorRepo;
@Service
public class ProfesorServiceImpl implements IProfesorService{
	@Autowired
	IProfesorRepo profesorRepo;
	@Override
	public void registrar(Profesor profesor) {
		// TODO Auto-generated method stub
			this.profesorRepo.insertar(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepo.actualizar(profesor);
	}

	@Override
	public Profesor encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.profesorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepo.eliminar(id);
	}

	@Override
	public Profesor buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.profesorRepo.buscarNombre(nombre);
	}

	@Override
	public Profesor buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.profesorRepo.buscarApellido(apellido);
	}

	@Override
	public Profesor buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.profesorRepo.buscarCedula(cedula);
	}

}
