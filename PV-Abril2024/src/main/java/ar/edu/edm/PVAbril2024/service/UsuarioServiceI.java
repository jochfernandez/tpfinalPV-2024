package ar.edu.edm.PVAbril2024.service;

import ar.edu.edm.PVAbril2024.entity.Docente;
import ar.edu.edm.PVAbril2024.entity.Estudiante;
import ar.edu.edm.PVAbril2024.entity.Pregunta;
import ar.edu.edm.PVAbril2024.entity.Usuario;

public interface UsuarioServiceI {
    public void crearDocente(Docente docente);
    public void crearEstudiante(Estudiante estudiante);
    public void modificarDocente(Docente docente);
    public void modificarEstudiante(Estudiante estudiante);
    public void eliminarUsuario(Usuario usuario);
    public Usuario obtenerUsuario(String dni);
    public void resolverCuestionario(Estudiante estudiante);
}
