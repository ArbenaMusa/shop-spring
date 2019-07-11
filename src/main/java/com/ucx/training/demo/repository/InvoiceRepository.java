package com.ucx.training.demo.repository;

import com.ucx.training.demo.entity.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends BaseRepository<Invoice,Integer>{
}
