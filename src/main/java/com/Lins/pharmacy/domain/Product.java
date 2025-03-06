package com.Lins.pharmacy.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product")
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    @Column(name = "price_in_cents")
    private Integer priceInCents;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "requires_prescription")
    private Boolean requiresPrescription;

    @Column(name = "ean_code")
    private String eanCode;

    public Product(ProductRequest request) {
        this.id = request.id();
        this.name = request.name();
        this.description = request.description();
        this.priceInCents = request.price_in_cents();
        this.stockQuantity = request.stock_quantity();
        this.requiresPrescription = request.requires_prescription();
        this.eanCode = request.ean_code()  ;
    }
}
