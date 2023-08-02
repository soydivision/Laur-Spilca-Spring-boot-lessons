package beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private String text;

    @PostConstruct //called immediately after creation of component
    private void init() {
        this.text = "Hello";
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
