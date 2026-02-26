package EjercicioPracticoIanBrenes.demo.controllers;

import EjercicioPracticoIanBrenes.demo.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("servicios", servicioService.listarTodos());
        return "index";
    }
}