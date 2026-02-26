package EjercicioPracticoIanBrenes.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

    @GetMapping
    public String mostrarFormulario() {
        return "contacto/formulario";
    }

    @PostMapping("/enviar")
    public String enviar() {
        return "redirect:/contacto?enviado=true";
    }
}
