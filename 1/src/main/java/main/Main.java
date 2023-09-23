package main;


import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductDeliveryService productDeliveryService = context.getBean(ProductDeliveryService.class);
            productDeliveryService.addProduct();
        }
    }
}
