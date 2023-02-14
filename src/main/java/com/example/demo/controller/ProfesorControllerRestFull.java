package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IProfesorService;
import com.example.demo.modelo.Profesor;

//estereotipo para esta capa:
@RestController
@RequestMapping("/profesores")
public class ProfesorControllerRestFull {
	//metodos son las capacidades 
	@Autowired
	private IProfesorService profesorService;
	
	@PostMapping
	public void registrar(@RequestBody  Profesor profesor) {
		this.profesorService.registrar(profesor);
		
	}
	@PutMapping(path = "/{id}")
	public void actualizar(@PathVariable("id") Integer id,@RequestBody Profesor profesor) {
		profesor.setId(id);
		this.profesorService.actualizar(profesor);
	}
	
	@PutMapping
	public void actualizarTodos(Profesor profesor) {
		//
	}
	
	
	
	@GetMapping(path = "/{id}")
	public Profesor buscarId(@PathVariable("id") Integer id) {
		return this.profesorService.encontrar(id);
	}
	
	@GetMapping(path = "/cedulas/{cedula}")
	public Profesor buscarCedula(@PathVariable("cedula") String cedula) {
		return this.profesorService.buscarCedula(cedula);
	}
	
	
	@DeleteMapping
	public void borrarTodos(Integer id) {
		  
	}

	@DeleteMapping(path = "/{id}")
	public void borrarId(@PathVariable("id") Integer id) {
		this.profesorService.borrar(id);
	}

}
