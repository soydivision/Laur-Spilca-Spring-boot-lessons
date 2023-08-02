package bean;


import org.springframework.context.annotation.Bean;

public class MyBean {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
