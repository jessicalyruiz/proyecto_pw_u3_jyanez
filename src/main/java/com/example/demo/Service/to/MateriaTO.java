package com.example.demo.Service.to;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.modelo.Materia;

public class MateriaTO extends RepresentationModel<MateriaTO> implements Serializable{
	private Integer id;
	private String nombre;
	
	private Integer creditos;

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

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	
	
	
}
