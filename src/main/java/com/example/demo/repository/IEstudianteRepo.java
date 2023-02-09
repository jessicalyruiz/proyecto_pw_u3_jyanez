package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);
	public List<Estudiante> buscarTodos();
	public List<Estudiante> buscarTodosSalario(BigDecimal salario);
}
