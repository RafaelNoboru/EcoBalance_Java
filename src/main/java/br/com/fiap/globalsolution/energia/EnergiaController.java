package br.com.fiap.globalsolution.energia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EnergiaController {

    @Autowired
    ProducaoEnergiaRepository producaoEnergiaRepository;

    @Autowired
    ConsumoEnergiaRepository consumoEnergiaRepository;

    @GetMapping("/historico/{empresaId}")
    public String exibirHistorico(@PathVariable Long empresaId, Model model) {

        List<ProducaoEnergia> producoes = producaoEnergiaRepository.findByEmpresaId(empresaId);
        List<ConsumoEnergia> consumos = consumoEnergiaRepository.findByEmpresaId(empresaId);

        model.addAttribute("producoes", producoes);
        model.addAttribute("consumos", consumos);

        return "historico";
    }
}
