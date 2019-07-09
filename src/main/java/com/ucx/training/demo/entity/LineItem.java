package com.ucx.training.demo.entity;

import com.ucx.training.demo.type.RecordStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;

}
