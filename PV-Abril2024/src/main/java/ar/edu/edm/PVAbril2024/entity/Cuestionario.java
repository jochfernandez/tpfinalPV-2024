package ar.edu.edm.PVAbril2024.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name="cuestionarios")
public class Cuestionario {
    @Id
    @Column(name="cod_cuestionario")
    private String codCuestionario;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="materia")
    private String materia;
    @Column(name="duracion")
    private LocalDate duracion;
    @Column(name="estado")
    private Boolean estado;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "")
    @JoinTable(
            name = "cuestionario_estudiantes",
            joinColumns = @JoinColumn(name = "cod_cuestionario"),
            inverseJoinColumns = @JoinColumn(name = "dni")

    )
    private List<Estudiante> estudiantes;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "cuestionario_preguntas",
            joinColumns = @JoinColumn(name = "cod_cuestionario"),
            inverseJoinColumns = @JoinColumn(name = "cod_pregunta")
    )
    private List<Pregunta> preguntas;
    @ManyToOne
    @JoinColumn(name="dni")
    private Docente docente;

    public Cuestionario(String codCuestionario, String descripcion, String materia, LocalDate duracion, Boolean estado) {
        this.codCuestionario = codCuestionario;
        this.descripcion = descripcion;
        this.materia = materia;
        this.duracion = duracion;
        this.estado = estado;
    }

    public Cuestionario() {

    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public LocalDate getDuracion() {
        return duracion;
    }


    public void setDuracion(LocalDate duracion) {
        this.duracion = duracion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

}
