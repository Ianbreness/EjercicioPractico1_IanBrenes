package EjercicioPracticoIanBrenes.demo.service;

import EjercicioPracticoIanBrenes.demo.domain.Servicio;
import EjercicioPracticoIanBrenes.demo.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public List<Servicio> listarTodos() {
        return servicioRepository.findAll();
    }

    public Optional<Servicio> buscarPorId(Integer id) {
        return servicioRepository.findById(id);
    }

    public void guardar(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    public void eliminar(Integer id) {
        servicioRepository.deleteById(id);
    }
}