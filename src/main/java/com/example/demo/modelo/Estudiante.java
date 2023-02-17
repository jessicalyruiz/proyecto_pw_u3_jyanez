package com.example.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_esturio")
	@SequenceGenerator(name = "seq_esturio", sequenceName = "seq_esturio", allocationSize = 1)
	private Integer id;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_telefono")
	private String telefono;

	@Column(name = "estu_fecha_nacimiento", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name = "estu_genero")
	private String genero;
	
	@Column(name = "estu_salario")
	private BigDecimal salario;

	@OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
	private List<Materia> materias;
	

	
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







	public List<Materia> getMaterias() {
		return materias;
	}







	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
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
