package ar.edu.edm.PVAbril2024.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;
@Entity
@DiscriminatorValue("Estudiante")
public class Estudiante extends Usuario{
    public Estudiante(String nombre, String apellido, String email, String password, Boolean estado, List<Cuestionario> cuestionarios) {
        super(nombre, apellido, email, password, estado, cuestionarios);
    }

    public Estudiante() {

    }
}
