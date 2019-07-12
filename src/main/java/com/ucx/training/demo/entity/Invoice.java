package com.ucx.training.demo.entity;

import com.ucx.training.demo.type.RecordStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice extends BaseEntity<Integer> {
    private Integer invoiceNumber;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Customer customer;
    @OneToMany(mappedBy = "invoice", fetch = FetchType.LAZY)
    private List<LineItem> list = new ArrayList<>();
    private BigDecimal total;

    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    @Builder
    public Invoice(Integer id, RecordStatus recordStatus, Integer invoiceNumber, Customer customer, List<LineItem> list) {
        super(id, recordStatus);
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.list = list;
        this.total = list
                .stream()
                .map(e -> e.getProduct().getUnitPrice().multiply(BigDecimal.valueOf(e.getQuantity())))
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
    }
}
