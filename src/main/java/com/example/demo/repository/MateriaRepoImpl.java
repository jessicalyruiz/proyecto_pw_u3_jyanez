package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Service.IEstudianteService;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	EntityManager entitiManager;
	
	@Autowired 
	IEstudianteService estudianteService;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entitiManager.persist(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.entitiManager.merge(materia);
	}

	@Override
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entitiManager.find(Materia.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entitiManager.remove(this.buscar(id));
	}

	@Override
	public List<Materia> buscarPorEstudiante(Integer isEstudiante) {
		TypedQuery<Materia> myQuery = this.entitiManager
				.createQuery("Select c from Materia c where c.estudiante=:valor", Materia.class);
		myQuery.setParameter("valor", this.estudianteService.encontrar(isEstudiante) );
		return myQuery.getResultList();
	}

	

}
