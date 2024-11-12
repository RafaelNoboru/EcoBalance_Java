package br.com.fiap.globalsolution.email;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    @Autowired
    private JavaMailSender emailSender;

    @RabbitListener(queues = "emailQueue")
    public void processarEmail(EmailMessage emailMessage) {
        enviarEmail(emailMessage);
    }

    public void enviarEmail(EmailMessage emailMessage) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailMessage.getDestinatario());
        message.setSubject(emailMessage.getAssunto());
        message.setText(emailMessage.getCorpo());

        emailSender.send(message);
    }
}
