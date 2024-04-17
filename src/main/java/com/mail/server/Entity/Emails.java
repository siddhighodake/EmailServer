package com.mail.server.Entity;

import lombok.Data;

@Data
public class Emails
{
    private String[] to1;
    private String subject1;
    private String message1;

    public String[] getTo1() {
        return to1;
    }

    public void setTo1(String[] to1) {
        this.to1 = to1;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }
}
