package br.com.fiap.globalsolution.thingerio;

import br.com.fiap.globalsolution.empresa.EmpresaService;
import br.com.fiap.globalsolution.empresa.EmpresaUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.databind.JsonNode;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DashboardController {

    @Autowired
    private ThingerService thingerService;

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/dashboard")
    public String getDashboard(Principal principal, Model model) {

        String email = principal.getName();
        Long empresaId = empresaService.obterEmpresaIdPeloEmail(email);

        Map<String, Integer> dadosDeEnergia = obterDadosDeEnergiaDoThinger();

        Integer consumo = dadosDeEnergia.get("Consumo de Energia (Potenciômetro)");
        Integer producao = dadosDeEnergia.get("Produção de Energia (LDR)");

        model.addAttribute("consumo", consumo);
        model.addAttribute("producao", producao);
        model.addAttribute("empresaId", empresaId);

        return "dashboard";
    }

    private Map<String, Integer> obterDadosDeEnergiaDoThinger() {
        Map<String, Integer> dados = new HashMap<>();
        dados.put("Consumo de Energia (Potenciômetro)", 2502);
        dados.put("Produção de Energia (LDR)", 3431);
        return dados;
    }

    @GetMapping("/admin/email")
    public String emailPage() {
        return "email";
    }
}

