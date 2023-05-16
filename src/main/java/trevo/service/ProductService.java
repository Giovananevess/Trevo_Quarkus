package trevo.service;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import trevo.dto.ProductDto;
import trevo.entity.Product;
import trevo.repository.ProductRepository;


@ApplicationScoped
public class ProductService {
    @Inject
    ProductRepository productRepository;

    public Response register(@RequestBody @Valid ProductDto dto) {
        Product product = new Product(dto);
        product.persist();
        return Response.ok().build();

    }
    public Response list() {
        PanacheQuery<PanacheEntityBase> product = Product.findAll();
        if (product.list().isEmpty()) {
        }
        return Response.ok().build();
    }

//    PanacheQuery<PanacheEntityBase> product = Product.findAll();
//        if (product.list().isEmpty()) {
//    }

//    public List<Product> findAllProduct() {
//        return productRepository.findAll().list();
//    }
//    public void addProduct(Product product) {
//        productRepository.persist(product);
//    }
}
