package ar.edu.edm.PVAbril2024.service.imp;

import ar.edu.edm.PVAbril2024.entity.Cuestionario;
import ar.edu.edm.PVAbril2024.entity.Docente;
import ar.edu.edm.PVAbril2024.entity.Estudiante;
import ar.edu.edm.PVAbril2024.repository.CuestionarioRepository;
import ar.edu.edm.PVAbril2024.service.CuestionarioServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuestionarioServiceImp implements CuestionarioServiceI {
    @Autowired
    private CuestionarioRepository cuestionarioRepository;
    @Override
    public Cuestionario crearCuestionario(Docente docente, Cuestionario cuestionario) {
        return null;
    }

    @Override
    public Cuestionario obtenerCuestionario(Integer codCuestionario) {
        return null;
    }

    @Override
    public void eliminarCuestionario(Integer codCuestionario) {

    }

    @Override
    public void modificarCuestionario(Cuestionario cuestionario) {

    }

    @Override
    public List<Estudiante> obtenerEstudiantesCuestionario(String dni, String codCuestionario) {
        return null;
    }

}
