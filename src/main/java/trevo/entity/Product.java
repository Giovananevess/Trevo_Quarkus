package trevo.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import java.time.LocalDate;

@Table(name = "tb_product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Product {
    @Id
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
}
