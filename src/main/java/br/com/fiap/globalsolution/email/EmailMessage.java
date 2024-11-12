package br.com.fiap.globalsolution.email;

import lombok.Data;

@Data
public class EmailMessage {

    private String destinatario;
    private String assunto;
    private String corpo;

    public EmailMessage(String destinatario, String assunto, String corpo) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }
}
