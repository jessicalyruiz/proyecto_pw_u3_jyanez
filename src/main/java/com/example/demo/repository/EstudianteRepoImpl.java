package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext
	EntityManager entitiManager;
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entitiManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entitiManager.merge(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entitiManager.find(Estudiante.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		 this.entitiManager.remove(this.buscar(id));
	}

}
