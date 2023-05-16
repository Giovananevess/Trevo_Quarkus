package trevo.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import trevo.dto.ProductDto;

import java.time.LocalDate;

@Table(name = "tb_product")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Product extends PanacheEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "Text")
    private String description;

    private LocalDate data;

    private String culture;

    private String area;

    public Product(ProductDto dto) {
        this.name = dto.name();
        this.description = dto.description();
        this.data = LocalDate.now();
        this.culture = dto.culture();
        this.area = dto.area();
    }
}
