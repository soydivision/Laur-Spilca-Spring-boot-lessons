package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ProductRep;

@Service
public class ProductDeliveryService {
    @Autowired
    private ProductRep productRep;

    public void addProduct() {
        productRep.add();
    }


}
