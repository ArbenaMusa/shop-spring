package com.ucx.training.demo.entity;

import com.ucx.training.demo.type.RecordStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer invoiceNumber;
    @ManyToOne
    private Costumer costumer;
    @ManyToMany
    private List<LineItem> list = new ArrayList<>();

    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;
}
