package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;
@Service
public class EstudianteService implements IEstudianteService{
	@Autowired
	IEstudianteRepo estudianteRepo;
	@Override
	public void registrar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudiante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
