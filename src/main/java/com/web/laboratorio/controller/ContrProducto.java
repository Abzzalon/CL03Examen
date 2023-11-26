package com.web.laboratorio.controller;

import com.web.laboratorio.entidad.Producto;
import com.web.laboratorio.repositorio.InterProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContrProducto {

    @Autowired
    InterProducto interProducto;

    @GetMapping("/ListadoProducto")
    public String ListadoProducto(Model model){
        model.addAttribute("listado", interProducto.findAll());
        return "ListadoProducto";
    }

    @GetMapping("/AgregarProducto")
    public String AgregarProducto(Model model){
        model.addAttribute("pro", new Producto());
        return "AgregarProducto";
    }

    @GetMapping("/EditarProducto/{id}")
    public String EditarProducto(Model model, @PathVariable Integer id){
        model.addAttribute("pro", interProducto.findById(id));
        return "AgregarProducto";
    }

    @PostMapping("/GuardarProduc")
    public String GuardarProduc(Model model, @ModelAttribute Producto pro){
        interProducto.save(pro);
        return "redirect:/ListadoProducto";
    }

    @PostMapping("/DeleteProducto")
    public String DeleteProducto(@RequestParam Integer productoId){
        interProducto.deleteById(productoId);
        return "redirect:/ListadoProducto";
    }

}
