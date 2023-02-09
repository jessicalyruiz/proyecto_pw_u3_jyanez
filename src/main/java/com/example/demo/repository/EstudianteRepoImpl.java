package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

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

	@Override
	public Estudiante buscarNombre(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entitiManager
				.createQuery("Select c from Estudiante c where c.nombre=:valor", Estudiante.class);
		myQuery.setParameter("valor", nombre);
		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entitiManager
				.createQuery("Select c from Estudiante c where c.apellido=:valor", Estudiante.class);
		myQuery.setParameter("valor", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarTodos() {
		TypedQuery<Estudiante> myQuery = this.entitiManager.createQuery("Select c from Estudiante c", Estudiante.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarTodosSalario(BigDecimal salario) {
TypedQuery<Estudiante> myQuery=this.entitiManager.createQuery("Select c from Estudiante c where c.salario>=:valor", Estudiante.class);
		myQuery.setParameter("valor", salario);
		return myQuery.getResultList();
	}

}
