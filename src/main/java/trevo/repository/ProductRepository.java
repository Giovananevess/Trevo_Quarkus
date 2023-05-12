package trevo.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import trevo.entity.Product;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
}
