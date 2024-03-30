package ar.edu.edm.PVAbril2024.service;

import ar.edu.edm.PVAbril2024.entity.Cuestionario;
import ar.edu.edm.PVAbril2024.entity.Docente;
import ar.edu.edm.PVAbril2024.entity.Estudiante;

import java.util.List;

public interface CuestionarioServiceI {
    public Cuestionario crearCuestionario(Docente docente, Cuestionario cuestionario);
    public Cuestionario obtenerCuestionario(Integer codCuestionario);
    public void eliminarCuestionario(Integer codCuestionario);
    public void modificarCuestionario(Cuestionario cuestionario);
    public List<Estudiante> obtenerEstudiantesCuestionario(String dni, String codCuestionario);
}
