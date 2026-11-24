package com.example.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "greetingBean")
@ViewScoped
public class GreetingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String message;
    private final List<String> technologies = new ArrayList<>(Arrays.asList("Java 8", "JSF 2.2", "Facelets"));

    public void greet() {
        String who = (name == null || name.trim().isEmpty()) ? "World" : name.trim();
        message = "Hello, " + who + "! (" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getTechnologies() {
        return technologies;
    }
}
