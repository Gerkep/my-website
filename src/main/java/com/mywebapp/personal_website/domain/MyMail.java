package com.mywebapp.personal_website.domain;

public class MyMail {

    private String mail;
    private String title;
    private String text;

    public MyMail(String mail, String title, String text) {
        this.mail = mail;
        this.text = text;
        this.title = title;
    }

    public MyMail() {
    };

    public void setEmail(String mail) {
        this.mail = mail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMail() {
        return mail;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
