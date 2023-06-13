package io.github.soydivision.main;

import io.github.soydivision.beans.BeanExample;
import io.github.soydivision.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            BeanExample beanExample = context.getBean(BeanExample.class);
            System.out.println(beanExample.getText());
        }
    }
}
