package com.example.demo.Service;

import java.util.List;

import com.example.demo.Service.to.MateriaTO;
import com.example.demo.modelo.Materia;

public interface IMateriaService {

	public void insertar(MateriaTO materia);
	public void actualizar(MateriaTO materia);
	public MateriaTO buscar(Integer id);
	public void eliminar(Integer id);
	public List<MateriaTO> buscarPorEstudiante(Integer isEstudiante);
	

}
