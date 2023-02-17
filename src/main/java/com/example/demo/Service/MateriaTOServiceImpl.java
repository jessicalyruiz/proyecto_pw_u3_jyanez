package com.example.demo.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.to.MateriaTO;
import com.example.demo.modelo.Materia;
import com.example.demo.repository.IMateriaRepo;



@Service
public class MateriaTOServiceImpl implements IMateriaService{
	@Autowired
	IMateriaRepo materiaRepo;
	
	@Override
	public void actualizar(MateriaTO materia) {
		// TODO Auto-generated method stub
		//this.materiaRepo.actualizar(materia);
	}

	

	private MateriaTO convertir(MateriaTO materia) {
		MateriaTO materiaTO= new MateriaTO();
		materiaTO.setId(materia.getId());
		materiaTO.setNombre(materia.getNombre());
		materiaTO.setCreditos(materia.getCreditos());
	
		return materiaTO;
	}

	@Override
	public void insertar(MateriaTO materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MateriaTO buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MateriaTO> buscarPorEstudiante(Integer isEstudiante) {
		// TODO Auto-generated method stub
		List<Materia>m= this.materiaRepo.buscarPorEstudiante(isEstudiante);
		return null;
	}
}
