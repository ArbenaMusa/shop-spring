package com.ucx.training.demo.repository;

import com.ucx.training.demo.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer,Integer>{
}