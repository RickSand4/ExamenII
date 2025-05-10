package com.upiiz.examenii.Controllers;

import org.springframework.ui.Model;
import com.upiiz.examenii.Models.DepartamentoModel;
import com.upiiz.examenii.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DepartamentosController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public String departamentos(Model model) {
        List<DepartamentoModel> departamentos = departamentoService.findAll();
        model.addAttribute("departamentos", departamentos);
        return "listado-departamentos";
    }
    @GetMapping("/departamentos/new")
    public String newDepartamento(Model model) {
        model.addAttribute("departamento", new DepartamentoModel());
        return "agregar-departamento";
    }
    @PostMapping("/departamentos/guardar")
    public String guardarDepartamento(@ModelAttribute("departamento") DepartamentoModel departamento) {
        departamentoService.save(departamento);
        return "redirect:/departamentos";
    }
    @GetMapping("/departamentos/delete/{idDepartamento}")
    public String deleteDepartamento(@PathVariable ("idDepartamento")int idDepartamento, Model model) {
        DepartamentoModel departamento = departamentoService.findById(idDepartamento);
        model.addAttribute("departamento", departamento);
        return "eliminar-departamento";
    }
  @PostMapping("/departamentos/delete")
    public String eliminarDepartamento(@ModelAttribute DepartamentoModel departamento) {
       departamentoService.delete(departamento.getIdDepartamento());
    return "redirect:/departamentos";
    }
    @GetMapping("/departamentos/edit/{idDepartamento}")
    public String editDepartamento(@PathVariable ("idDepartamento")int idDepartamento, Model model) {
        DepartamentoModel departamento = departamentoService.findById(idDepartamento);
        model.addAttribute("departamento", departamento);
        return "editar-departamento";
    }
    @PostMapping("/departamentos/edit")
    public String editarDepartamento(@ModelAttribute DepartamentoModel departamento) {
        departamentoService.update(departamento);
        return "redirect:/departamentos";
    }
}
