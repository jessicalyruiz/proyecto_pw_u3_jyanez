package com.example.demo;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.IProfesorService;
import com.example.demo.modelo.Profesor;

@SpringBootApplication
public class ProyectoPwU3JyanezApplication implements CommandLineRunner{

	@Autowired
	private IProfesorService profesorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPwU3JyanezApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Profesor p1=new Profesor();
		p1.setApellido("prueba profesor");
		this.profesorService.registrar(p1);
	}

}
