package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Materia;

public interface IMateriaRepo {

	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public Materia buscar(Integer id);
	public void eliminar(Integer id);
	public List<Materia> buscarPorEstudiante(Integer isEstudiante);
}
