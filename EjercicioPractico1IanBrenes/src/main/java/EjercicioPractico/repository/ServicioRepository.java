package EjercicioPracticoIanBrenes.demo.repository;

import EjercicioPracticoIanBrenes.demo.domain.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
}