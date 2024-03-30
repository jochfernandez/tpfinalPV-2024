package ar.edu.edm.PVAbril2024.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@DiscriminatorValue("Docente")
public class Docente extends Usuario{
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "usuario_cuestionarios",
            joinColumns = @JoinColumn(name = "dni"),
            inverseJoinColumns = @JoinColumn(name = "cod_pregunta")
    )
    private List<Pregunta> preguntas;

    public Docente(String nombre, String apellido, String email, String password, Boolean estado, List<Cuestionario> cuestionarios) {
        super(nombre, apellido, email, password, estado, cuestionarios);
    }

    public Docente() {

    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

}
