package com.example.demo.Service.to;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.modelo.Materia;

public class EstudianteTO extends RepresentationModel<EstudianteTO> implements Serializable{

	private Integer id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
