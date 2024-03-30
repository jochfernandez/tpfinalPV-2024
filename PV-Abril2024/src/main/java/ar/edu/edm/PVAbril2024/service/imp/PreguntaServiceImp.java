package ar.edu.edm.PVAbril2024.service.imp;

import ar.edu.edm.PVAbril2024.entity.Pregunta;
import ar.edu.edm.PVAbril2024.repository.PreguntaRepository;
import ar.edu.edm.PVAbril2024.service.PreguntaServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaServiceImp implements PreguntaServiceI {
    @Autowired
    private PreguntaRepository preguntaRepository;
    @Override
    public Pregunta crearPregunta(Pregunta pregunta) {
        return null;
    }

    @Override
    public Pregunta modificarPregunta(Pregunta pregunta) {
        return null;
    }

    @Override
    public void eliminarPregunta(Pregunta pregunta) {

    }

    @Override
    public Pregunta obtenerPregunta(Integer codPregunta) {
        return null;
    }
}
