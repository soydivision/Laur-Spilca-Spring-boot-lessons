package main;


import beans.Cat;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
        //    Cat cat = c.getBean(Cat.class);
            Owner owner = c.getBean(Owner.class);
//            cat.setName("Leo");
//            System.out.println(cat);
            System.out.println(owner);
        }
    }
}
