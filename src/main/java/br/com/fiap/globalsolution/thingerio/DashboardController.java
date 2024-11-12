package br.com.fiap.globalsolution.thingerio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DashboardController {

    @Autowired
    private ThingerService thingerService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {

        Map<String, Integer> dadosDeEnergia = obterDadosDeEnergiaDoThinger();

        Integer consumo = dadosDeEnergia.get("Consumo de Energia (Potenciômetro)");
        Integer producao = dadosDeEnergia.get("Produção de Energia (LDR)");

        model.addAttribute("consumo", consumo);
        model.addAttribute("producao", producao);

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

