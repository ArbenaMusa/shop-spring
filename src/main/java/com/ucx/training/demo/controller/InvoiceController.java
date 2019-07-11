package com.ucx.training.demo.controller;

import com.ucx.training.demo.entity.Invoice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop/invoices")
public class InvoiceController extends BaseController<Invoice, Integer> {
}
