package com.example.springbootpracitceandmicroservices.helloWorldBean;


import org.springframework.context.annotation.Bean;

public class HelloWorldBean {

    String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
