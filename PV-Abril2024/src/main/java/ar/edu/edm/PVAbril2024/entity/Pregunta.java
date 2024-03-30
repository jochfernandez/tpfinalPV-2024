package ar.edu.edm.PVAbril2024.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id
    @Column(name="cod_pregunta")
    private String codPregunta;
    @Column(name = "opcion1")
    private String opcion1;
    @Column(name = "opcion2")
    private String opcion2;
    @Column(name = "opcion3")
    private String opcion3;
    @Column(name = "opcion4")
    private String opcion4;
    @Column(name = "opcion_correcta")
    private String opcionCorrecta;
    @Column(name = "puntaje")
    private int puntaje;
    @ManyToOne
    @JoinColumn(name = "dni")
    private Docente docente;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "cuestionario_preguntas",
            joinColumns = @JoinColumn(name = "cod_pregunta"),
            inverseJoinColumns = @JoinColumn(name = "cod_cuestionario")
    )
    private List<Cuestionario> cuestionarios;

    public Pregunta(String codPregunta, String opcion1, String opcion2, String opcion3, String opcion4, String opcionCorrecta, int puntaje) {
        this.codPregunta = codPregunta;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.opcionCorrecta = opcionCorrecta;
        this.puntaje = puntaje;
    }

    public Pregunta() {

    }

    public String getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(String codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(String opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Cuestionario> getCuestionarios() {
        return cuestionarios;
    }

    public void setCuestionarios(List<Cuestionario> cuestionarios) {
        this.cuestionarios = cuestionarios;
    }

}
