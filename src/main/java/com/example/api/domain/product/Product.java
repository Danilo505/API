package com.example.api.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private  String description;

    private  Double price;

    private Integer quantity;

    public Product(RequestProduct product){
        this.name = product.name();
        this.description = product.description();
        this.price = product.price();
        this.quantity = product.quantity();
    }
}
