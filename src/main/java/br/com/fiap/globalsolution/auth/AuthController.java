package br.com.fiap.globalsolution.auth;

import br.com.fiap.globalsolution.empresa.Empresa;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestBody Empresa empresa) {
        return "redirect:/home";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    public void logUserAuthorities() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getAuthorities().forEach(authority -> {
            System.out.println("Authority: " + authority.getAuthority());
        });
    }
}
