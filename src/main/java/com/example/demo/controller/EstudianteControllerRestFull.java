package com.example.demo.controller;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.example.demo.Service.to.EstudianteTO;
import com.example.demo.Service.to.MateriaTO;
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
	@PutMapping(path = "/{id}", consumes = {
			MediaType.APPLICATION_JSON_VALUE
	})
	public void actualizar(@PathVariable("id") Integer id,@RequestBody Estudiante estudiante, @RequestParam String provincia) {
		estudiante.setId(id);
		System.out.println(provincia);
		this.estudianteService.actualizar(estudiante);
		
		
		
	}
	
	@PutMapping(path = "/act2/{id}", consumes = {
			MediaType.APPLICATION_JSON_VALUE
	},produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Estudiante> actualizar2(@PathVariable("id") Integer id,@RequestBody Estudiante estudiante, @RequestParam String provincia) {
		estudiante.setId(id);
		System.out.println(provincia);
		this.estudianteService.actualizar(estudiante);
		Estudiante estu=this.estudianteService.encontrar(id);
		System.out.println(estu);
		return ResponseEntity.status(HttpStatus.OK).body(estu);
		
		
		
	}
	
	

	
	
	@PutMapping
	public void actualizarTodos(Estudiante estudiante) {
		
	}
	
	
	@GetMapping(path ="/{id}", produces = {
			MediaType.APPLICATION_JSON_VALUE
	})
	public ResponseEntity<Estudiante>  encontrar(@PathVariable("id") Integer id) {
		
		Estudiante estu=this.estudianteService.encontrar(id);
		return ResponseEntity.status(230).body(estu);
		
		 
		
	}
	
	@GetMapping(path = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<Estudiante> encontrarTodos() {
		
		HttpHeaders cabeceras=new HttpHeaders();
		cabeceras.add("detalle msj", "Estudiantes encontrados correctamente");
		 List<Estudiante> lista=this.estudianteService.buscarTodos();
//		return new ResponseEntity<>(lista, cabeceras,230);
		return lista;
		
	}
	
	@GetMapping(path = "/salario")
	public List<Estudiante> encontrarTodosSalario(@RequestParam("salario") BigDecimal salario) {
		
		
		return this.estudianteService.buscarTodosSalario(salario);
		
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		  this.estudianteService.borrar(id);
	}
	
	@PostMapping(path = "/borrar/{id}")
	public void borrarT(@PathVariable("id") Integer id) {
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
	
	
	
	///////////
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<EstudianteTO> encontrarTodosHateoas() {
		List<EstudianteTO> listaTO=this.estudianteService.buscarTodosTO();
		//hacer el hipervinculo
		for (EstudianteTO estudianteTO : listaTO) {
			//es una representacion de una capacidad
			Link myLink=linkTo(methodOn(EstudianteControllerRestFull.class).buscarMaterias(estudianteTO.getId())).withRel("materias");
			estudianteTO.add(myLink);
			Link myLink2=linkTo(methodOn(EstudianteControllerRestFull.class).encontrar(estudianteTO.getId())).withSelfRel();
			estudianteTO.add(myLink2);
			
			Link myLink3=linkTo(EstudianteControllerRestFull.class).slash("prueba").slash("estuddiantes").slash(estudianteTO.getId()).withRel("enlacePrueba");
			estudianteTO.add(myLink3);
		}
		
		return listaTO;
		
		
	}
	
	@GetMapping(path = "/{idEstudiante}/materias")
	public List<MateriaTO> buscarMaterias(@PathVariable("idEstudiante") Integer idEstudiante){
		return null;
	}
	
	/*
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public  ResponseEntity<List<Estudiante>> encontrarTodosHateoas() {
		List<EstudianteTO> listaTO=this.estudianteService.buscarTodosTO();
		
		
		return null;
		
		
	}*/
	

}
