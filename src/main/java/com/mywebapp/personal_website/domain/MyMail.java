package com.mywebapp.personal_website.domain;

public class MyMail {

    private String text;

    public MyMail(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
