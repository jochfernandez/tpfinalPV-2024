package ar.edu.edm.PVAbril2024.service.imp;

import ar.edu.edm.PVAbril2024.entity.Docente;
import ar.edu.edm.PVAbril2024.entity.Estudiante;
import ar.edu.edm.PVAbril2024.entity.Usuario;
import ar.edu.edm.PVAbril2024.repository.UsuarioRepository;
import ar.edu.edm.PVAbril2024.service.UsuarioServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioServiceI {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public void crearDocente(Docente docente) {
        usuarioRepository.save(docente);
    }

    @Override
    public void crearEstudiante(Estudiante estudiante) {
        usuarioRepository.save(estudiante);
    }

    @Override
    public void modificarDocente(Docente docente) {
        Docente docenteAModificar = (Docente) usuarioRepository.findById(docente.getDni()).get();
        docenteAModificar.setNombre(docente.getNombre());
        docenteAModificar.setApellido(docente.getApellido());
        docenteAModificar.setEmail(docente.getEmail());
        docenteAModificar.setCuestionarios(docente.getCuestionarios());
        docenteAModificar.setEstado(docente.getEstado());
        docenteAModificar.setPreguntas(docente.getPreguntas());
        usuarioRepository.save(docenteAModificar);
    }

    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        Estudiante estudianteAModificar = (Estudiante) usuarioRepository.findById(estudiante.getDni()).get();
        estudianteAModificar.setNombre(estudiante.getNombre());
        estudianteAModificar.setApellido(estudiante.getApellido());
        estudianteAModificar.setEmail(estudiante.getEmail());
        estudianteAModificar.setCuestionarios(estudiante.getCuestionarios());
        estudianteAModificar.setEstado(estudiante.getEstado());
        usuarioRepository.save(estudianteAModificar);
    }


    @Override
    public void eliminarUsuario(Usuario usuario) {

    }

    @Override
    public Usuario obtenerUsuario(String dni) {
        return null;
    }

    @Override
    public void resolverCuestionario(Estudiante estudiante) {

    }
}
