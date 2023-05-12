package trevo.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import trevo.entity.Product;
import trevo.repository.ProductRepository;
import java.util.List;

@ApplicationScoped
public class ProductService {
    @Inject
    ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll().list();
    }
    public void addProduct(Product product) {
        productRepository.persist(product);
    }
}
