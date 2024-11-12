package br.com.fiap.globalsolution.empresa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmpresaDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;

    public EmpresaDTO(Long id, @NotBlank String nome, @Email String email, @NotBlank String telefone, @NotBlank String cnpj) {
    }
}
