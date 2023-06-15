package io.github.soydivision.main;

import io.github.soydivision.beans.BeanExample;
import io.github.soydivision.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            BeanExample beanExample1 = context.getBean("A", BeanExample.class);
            BeanExample beanExample2 = context.getBean("A", BeanExample.class);
            BeanExample beanExample3 = context.getBean("B", BeanExample.class);
            System.out.println(beanExample1.getText());
            System.out.println(beanExample2.getText());
            System.out.println(beanExample3.getText());
        }
    }
}
