package ar.edu.edm.PVAbril2024.repository;

import ar.edu.edm.PVAbril2024.entity.Cuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuestionarioRepository extends JpaRepository<Cuestionario, String>{
}
