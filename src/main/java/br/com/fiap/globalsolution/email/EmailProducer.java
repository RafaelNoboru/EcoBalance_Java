package br.com.fiap.globalsolution.email;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE_NAME = "emailExchange";
    private static final String ROUTING_KEY = "emailRoutingKey";

    public void enviarEmailParaFila(String emailDestinatario, String assunto, String corpo) {

        EmailMessage emailMessage = new EmailMessage(emailDestinatario, assunto, corpo);

        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, emailMessage);
    }
}

