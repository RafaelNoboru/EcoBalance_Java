package br.com.fiap.globalsolution.empresa;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "registro";
    }

    @PostMapping("/registrar")
    public String registrarEmpresa(@ModelAttribute @Valid Empresa empresa) {
        empresa.setPapel("USER");
        empresaService.cadastrarEmpresa(empresa);
        return "redirect:/login";
    }

}
