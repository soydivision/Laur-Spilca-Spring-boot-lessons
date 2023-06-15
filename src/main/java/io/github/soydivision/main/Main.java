package io.github.soydivision.main;

import io.github.soydivision.beans.BeanExample;
import io.github.soydivision.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            BeanExample beanExample1 = context.getBean("beanExample", BeanExample.class);
            BeanExample beanExample2 = context.getBean("beanExample2", BeanExample.class);
            BeanExample beanExample3 = context.getBean("beanExample", BeanExample.class);
            System.out.println(beanExample1.getText());
            System.out.println(beanExample2.getText());
            System.out.println(beanExample3.getText());
        }
    }
}
