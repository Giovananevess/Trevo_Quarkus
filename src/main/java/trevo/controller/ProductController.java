package trevo.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import trevo.entity.Product;
import trevo.service.ProductService;
import java.util.ArrayList;
import java.util.List;

@Path("/product")
public class ProductController {
    @Inject
    ProductService productService;
    @GET
    public List<Product> retrieveProduct() {
        List<Product> products = new ArrayList<>();
        try {
            products = productService.findAllProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    @POST
    @Transactional
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

}
