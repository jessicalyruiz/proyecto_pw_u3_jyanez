package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {
	
	@Id
	@Column(name = "profe_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_proferio")
	@SequenceGenerator(name = "seq_proferio", sequenceName = "seq_proferio", allocationSize = 1)
	private Integer id;
	
	@Column(name = "profe_apellido")
	private String apellido;
	
	@Column(name = "profe_nombre")
	private String nombre;
	
	@Column(name = "profe_cedula")
	private String cedula;

	@Column(name = "profe_telefono")
	private String telefono;

	@Column(name = "profe_fecha_nacimiento", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name = "profe_genero")
	private String genero;
	
	@Column(name = "profe_salario")
	private BigDecimal salario;

	
	

	
	///get y set
	
	public Integer getId() {
		return id;
	}







	public void setId(Integer id) {
		this.id = id;
	}







	public String getApellido() {
		return apellido;
	}







	public void setApellido(String apellido) {
		this.apellido = apellido;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getCedula() {
		return cedula;
	}







	public void setCedula(String cedula) {
		this.cedula = cedula;
	}







	public String getTelefono() {
		return telefono;
	}







	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}







	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}







	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}







	public String getGenero() {
		return genero;
	}







	public void setGenero(String genero) {
		this.genero = genero;
	}







	public BigDecimal getSalario() {
		return salario;
	}







	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}







	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero
				+ ", salario=" + salario + "]";
	}
}
