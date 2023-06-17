package main;

import config.ProjectConfiguration;
import beans.BeanExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            BeanExample beanExample1 = context.getBean(BeanExample.class);
            BeanExample beanExample2 = context.getBean(BeanExample.class);
            BeanExample beanExample3 = context.getBean(BeanExample.class);
            System.out.println(beanExample1.getText());
            System.out.println(beanExample2.getText());
            System.out.println(beanExample3.getText());
        }
    }
}
