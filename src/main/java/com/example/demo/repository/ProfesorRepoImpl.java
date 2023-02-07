package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProfesorRepoImpl implements IProfesorRepo{

	@PersistenceContext
	EntityManager entitiManager;
	
	@Override
	public void insertar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.entitiManager.persist(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.entitiManager.merge(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entitiManager.find(Profesor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		 this.entitiManager.remove(this.buscar(id));
	}

	@Override
	public Profesor buscarNombre(String nombre) {
		TypedQuery<Profesor> myQuery=this.entitiManager.createQuery("Select c from Profesor c where c.nombre=:valor", Profesor.class);
		myQuery.setParameter("valor", nombre);
		return myQuery.getSingleResult();
		
	}

	@Override
	public Profesor buscarApellido(String apellido) {
		TypedQuery<Profesor> myQuery=this.entitiManager.createQuery("Select c from Profesor c where c.apellido=:valor", Profesor.class);
		myQuery.setParameter("valor", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Profesor buscarCedula(String cedula) {
		TypedQuery<Profesor> myQuery=this.entitiManager.createQuery("Select c from Profesor c where c.cedula=:valor", Profesor.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
