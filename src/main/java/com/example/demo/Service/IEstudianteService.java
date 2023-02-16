package com.example.demo.Service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.Service.to.EstudianteTO;
import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public void registrar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante encontrar(Integer id);
	public void borrar(Integer id);
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);
	public List<Estudiante> buscarTodos();
	public List<Estudiante> buscarTodosSalario(BigDecimal salario);
	public List<EstudianteTO> buscarTodosTO();
}
