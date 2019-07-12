package com.ucx.training.demo.service;

import com.ucx.training.demo.entity.Customer;
import com.ucx.training.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService extends BaseService<Customer,Integer>{


}
