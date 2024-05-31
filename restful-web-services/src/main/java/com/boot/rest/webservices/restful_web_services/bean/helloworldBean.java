package com.boot.rest.webservices.restful_web_services.bean;

public class helloworldBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public helloworldBean(String message) {

        this.message = message;
    }

    @Override
    public String toString() {
        return "helloworldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
