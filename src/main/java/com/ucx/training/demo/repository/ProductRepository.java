package com.ucx.training.demo.repository;

import com.ucx.training.demo.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Integer> {
}
