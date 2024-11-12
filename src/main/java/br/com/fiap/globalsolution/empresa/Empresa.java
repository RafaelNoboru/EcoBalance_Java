package br.com.fiap.globalsolution.empresa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String nome;

    @Email
    String email;

    @NotBlank
    String telefone;

    @NotBlank
    String cnpj;

    @NotBlank
    String senha;

    private String papel;
}
