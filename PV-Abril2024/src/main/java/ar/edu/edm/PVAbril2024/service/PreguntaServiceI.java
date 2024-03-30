package ar.edu.edm.PVAbril2024.service;

import ar.edu.edm.PVAbril2024.entity.Pregunta;

public interface PreguntaServiceI {
    public Pregunta crearPregunta(Pregunta pregunta);
    public Pregunta modificarPregunta(Pregunta pregunta);
    public void eliminarPregunta(Pregunta pregunta);
    public Pregunta obtenerPregunta(Integer codPregunta);
}
