package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public void registrar(Estudiante estudiante) {
		
	}
	public void actualizar(Estudiante estudiante) {
		
	}
	
	@GetMapping(path ="/buscar/{id}")
	public Estudiante encontrar(@PathVariable("id") Integer id) {
		
		
		return this.estudianteService.encontrar(id);
		
	}
	public void borrar(Integer id) {
		
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
