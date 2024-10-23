package com.Anthony.Biblioteca_Digital.Controller;



import com.Anthony.Biblioteca_Digital.Model.BibliotecaModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BibliotecaController {
    private static List<BibliotecaModel> libros = new ArrayList<>();

    @GetMapping("/Biblioteca")
    public String Biblioteca(Model model) {
        model.addAttribute("libros", libros);
        return "Biblioteca";
    }

    @PostMapping("/guardarLibro")
    public String guardarLibro(@RequestParam String tituloLibro,
                               @RequestParam String autorLibro,
                               @RequestParam int anoPublicacion,
                               @RequestParam String generoLiterario,
                               @RequestParam String cantidadEjemplares) {
        BibliotecaModel libro = new BibliotecaModel(tituloLibro, autorLibro, anoPublicacion, generoLiterario, cantidadEjemplares);
        libros.add(libro);
        return "redirect:/Biblioteca"; // Redirigir de nuevo al formulario
    }

    @PostMapping("/eliminarLibro")
    public String eliminarLibro(@RequestParam int index) {
        if (index >= 0 && index < libros.size()) {
            libros.remove(index);
        }
        return "redirect:/Biblioteca"; // Redirigir de nuevo al formulario
    }
}
