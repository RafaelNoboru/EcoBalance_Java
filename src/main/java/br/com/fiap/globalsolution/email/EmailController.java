package br.com.fiap.globalsolution.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    private EmailProducer emailProducer;

    @GetMapping("/admin/enviar-email")
    public String exibirFormulario(Model model) {
        return "enviar-email";
    }

    @PostMapping("/admin/enviar-email")
    public String enviarEmail(@RequestParam String destinatario,
                              @RequestParam String assunto,
                              @RequestParam String corpo,
                              Model model) {

        emailProducer.enviarEmailParaFila(destinatario, assunto, corpo);
        model.addAttribute("mensagem", "E-mail enviado com sucesso para " + destinatario);
        return "redirect:/admin/email";
    }
}
