package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IEstudianteService;
import com.example.demo.modelo.Estudiante;

//estereotipo para esta capa:
@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFull {
	//metodos son las capacidades
	@Autowired
	private IEstudianteService estudianteService;
	
	@PostMapping
	public void registrar(@RequestBody Estudiante estudiante) {
		this.estudianteService.registrar(estudiante);
	}
	@PutMapping(path = "/{id}")
	public void actualizar(@PathVariable("id") Integer id,@RequestBody Estudiante estudiante, @RequestParam String provincia) {
		estudiante.setId(id);
		System.out.println(provincia);
		this.estudianteService.actualizar(estudiante);
	}
	
	@PutMapping
	public void actualizarTodos(Estudiante estudiante) {
		
	}
	
	
	@GetMapping(path ="/{id}")
	public Estudiante encontrar(@PathVariable("id") Integer id) {
		
		
		return this.estudianteService.encontrar(id);
		
	}
	
	@GetMapping()
	public List<Estudiante> encontrarTodos() {
		
		
		return this.estudianteService.buscarTodos();
		
	}
	
	@GetMapping(path = "/salario")
	public List<Estudiante> encontrarTodosSalario(@RequestParam("salario") BigDecimal salario) {
		
		
		return this.estudianteService.buscarTodosSalario(salario);
		
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		  this.estudianteService.borrar(id);
	}
	
	@DeleteMapping
	public void borrarTodos(Integer id) {
		  
	}

	@GetMapping(path ="/buscarNombre/{nombre}")
	public Estudiante encontrarNombre(@PathVariable("nombre") String nombre) {
		
		
		return this.estudianteService.buscarNombre(nombre);
		
	}

	@GetMapping(path ="/buscarApellido/{apellido}")
	public Estudiante encontrarApellido(@PathVariable("apellido") String apellido) {
		 
		
		return this.estudianteService.buscarApellido(apellido);
		
	}

}
