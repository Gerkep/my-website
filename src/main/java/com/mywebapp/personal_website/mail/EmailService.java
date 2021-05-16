package com.mywebapp.personal_website.mail;

import com.sendgrid.SendGrid;

import org.springframework.stereotype.Service;

import java.io.IOException;

import com.mywebapp.personal_website.domain.MyMail;
import com.sendgrid.*;

@Service
public class EmailService {

    public Response sendEmail(MyMail email) {
        Email from = new Email("messagerobot0@gmail.com");
        String subject = "Nowa wiadomość ze strony";
        Email to = new Email("piotrg2003@gmail.com");
        Content content = new Content("text/plain", "email.getText()");
        Mail mail = new Mail(from, subject, to, content);
        Response respons = null;
        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return respons;
    }
}
