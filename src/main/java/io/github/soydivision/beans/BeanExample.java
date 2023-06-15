package io.github.soydivision.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BeanExample {
    private String text;


    @PostConstruct
    private void postConstructInitializer() {
        this.text = "PC text";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
