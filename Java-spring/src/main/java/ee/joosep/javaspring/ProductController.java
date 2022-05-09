package ee.joosep.javaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    List<Product> products = new ArrayList<>();
    @GetMapping("products")
    public List<Product> getProducts() {
        return products;
    }
    @PostMapping("products")
    public List<Product> addProducts(@RequestBody Product product) {
        products.add(product);
        return products;
    }
}
