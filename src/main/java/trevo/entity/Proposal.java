//package trevo.entity;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Table(name = "tb_proposal")
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//public class Proposal {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(nullable = false)
////    @Length(max = 90)
//    private String name;
//
//    @Email
//    private String email;
//
//    private String telefone;
//
//    @ManyToMany
//    @JoinTable(
//            name = "tb_order_product",
//            joinColumns = {@JoinColumn(name = "id_order", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "id_product", referencedColumnName = "id")}
//    )
//    private List<Product> products;
//}
