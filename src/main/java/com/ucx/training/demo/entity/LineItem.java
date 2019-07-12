package com.ucx.training.demo.entity;

import com.ucx.training.demo.type.RecordStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LineItem extends BaseEntity<Integer> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer quantity;

    @Builder
    public LineItem(Integer id, RecordStatus recordStatus, Product product, Integer quantity) {
        super(id, recordStatus);
        this.product = product;
        this.quantity = quantity;
    }
}
