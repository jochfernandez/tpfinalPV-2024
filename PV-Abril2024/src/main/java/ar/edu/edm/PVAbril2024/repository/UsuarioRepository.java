package ar.edu.edm.PVAbril2024.repository;

import ar.edu.edm.PVAbril2024.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
}
