package com.mail.server.Controller;

import com.mail.server.Entity.Email;
import com.mail.server.Entity.Emails;
import com.mail.server.Service.Impl.EmailServiceImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smtp")
public class EmailServiceController
{
    @Autowired
    EmailServiceImpl esimpl;

    @PostMapping("/sendmail")
    public void sendMail(@RequestBody Email e)
    {
        esimpl.sendEmail(e.getTo(),e.getSubject(),e.getMessage());

    }

    @PostMapping("/sendmails")
    public void sendEmails(@RequestBody Emails es)
    {
        esimpl.sendEmails(es.getTo1(),es.getSubject1(),es.getMessage1());

    }

    @PostMapping("/sendmailwithhtml")
    public void sendEmailwithhtml(@RequestBody Email e) throws MessagingException {
        esimpl.sendEmailwithhtml(e.getTo(),e.getSubject(),e.getMessage());

    }


}
