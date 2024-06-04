package repos;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRep {

    public void add() {
        System.out.println("product++");
    }
}
