import configuration.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRep;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            ProductRep productRep = c.getBean(ProductRep.class);
//            Creation of new product:
//            Product p = new Product();
//            p.setName("Pes2");
//            p.setPrice(15);
//            productRep.addProduct(p);

            List<Product> products = productRep.getProducts();
            products.forEach(System.out::println);


        }
    }
}
