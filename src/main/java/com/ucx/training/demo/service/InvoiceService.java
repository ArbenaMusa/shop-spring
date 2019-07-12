package com.ucx.training.demo.service;

import com.ucx.training.demo.entity.Invoice;
import com.ucx.training.demo.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceService extends BaseService<Invoice, Integer> {
    /**
     * This method prints an Invoice with a given Invoice id.
     * @param id
     * @return
     */
    public Invoice print(Integer id) {
        return findById(id);
    }
}
