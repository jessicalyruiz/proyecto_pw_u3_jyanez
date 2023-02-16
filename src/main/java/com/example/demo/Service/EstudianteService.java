package com.example.demo.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.to.EstudianteTO;
import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;
@Service
public class EstudianteService implements IEstudianteService{
	@Autowired
	IEstudianteRepo estudianteRepo;
	@Override
	public void registrar(Estudiante estudiante) {
		// TODO Auto-generated method stub
			this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(id);
	}

	@Override
	public Estudiante buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombre(nombre);
	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarApellido(apellido);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarTodos();
	}

	@Override
	public List<Estudiante> buscarTodosSalario(BigDecimal salario) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarTodosSalario(salario);
	}

	@Override
	public List<EstudianteTO> buscarTodosTO() {
		List<Estudiante> estudiantes=this.estudianteRepo.buscarTodos();
		List<EstudianteTO> listaFinal=estudiantes.stream().map(estudiante-> this.convertir(estudiante)).collect(Collectors.toList());
		return listaFinal;
	}

	private EstudianteTO convertir(Estudiante estudiante) {
		EstudianteTO estu= new EstudianteTO();
		estu.setId(estudiante.getId());
		estu.setNombre(estudiante.getNombre());
		estu.setApellido(estudiante.getApellido());
		estu.setFechaNacimiento(estudiante.getFechaNacimiento());
		return estu;
	}
}
