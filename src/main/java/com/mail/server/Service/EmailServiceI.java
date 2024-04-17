package com.mail.server.Service;

import jakarta.mail.MessagingException;

public interface EmailServiceI
{
    public void sendEmail(String to,String subject,String message);

    public void sendEmails(String [] to,String subject,String message);

    public void sendEmailwithhtml(String to,String subject,String message) throws MessagingException;
}
