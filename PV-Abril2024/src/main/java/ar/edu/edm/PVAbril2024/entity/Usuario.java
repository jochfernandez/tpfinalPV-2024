package ar.edu.edm.PVAbril2024.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "Usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario")
@Table(name = "usuarios")
public abstract class Usuario {
    @Id
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "estado")
    private Boolean estado;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "usuario_cuestionarios",
            joinColumns = @JoinColumn(name = "dni"),
            inverseJoinColumns = @JoinColumn(name = "cod_cuestionario")
    )
    private List<Cuestionario> cuestionarios;


    public Usuario(String nombre, String apellido, String email, String password, List<Cuestionario> cuestionarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.estado = true;
        this.cuestionarios = cuestionarios;
    }

    public Usuario() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Cuestionario> getCuestionarios() {
        return cuestionarios;
    }

    public void setCuestionarios(List<Cuestionario> cuestionarios) {
        this.cuestionarios = cuestionarios;
    }
}
