package com.ucx.training.demo.controller;

import com.ucx.training.demo.entity.Invoice;
import com.ucx.training.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop/invoices")
public class InvoiceController extends BaseController<Invoice, Integer> {
}
