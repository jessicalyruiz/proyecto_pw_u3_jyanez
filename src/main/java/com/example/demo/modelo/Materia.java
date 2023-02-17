package com.example.demo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materi")
public class Materia {
	
	@Id
	@Column(name = "mate_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materio")
	@SequenceGenerator(name = "seq_materio", sequenceName = "seq_materio", allocationSize = 1)
	private Integer id;
	
	
	@Column(name = "mate_nombre")
	private String nombre;
	

	@Column(name = "mate_creditos")
	private Integer creditos;


	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mate_fk_estudiante")
	private Estudiante estudiante;
	
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


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	
	
	

}
