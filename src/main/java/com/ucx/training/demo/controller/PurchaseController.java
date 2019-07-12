//package com.ucx.training.demo.controller;
//
//import com.ucx.training.demo.DemoApplication;
//import com.ucx.training.demo.entity.Customer;
//import com.ucx.training.demo.entity.LineItem;
//import com.ucx.training.demo.service.InvoiceService;
//import com.ucx.training.demo.service.LineItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Logger;
//
//@RestController
//@RequestMapping("shop/purchase")
//public class PurchaseController
//{
//    static CustomerController customerController;
//    private static Customer customer;
//
//    private PurchaseController(Integer id) {
//        this.customer = customerController.findById(id);
//    }
//
//    /**
//     * This method returns a PurchaseServiceImpl with a given Costumer.
//     * @param id
//     * @return
//     */
//    @GetMapping("{id}")
//    public static final PurchaseController of(@PathVariable Integer id) {
//        PurchaseController.customer = customerController.findById(id);
//        return new PurchaseController;
//    }
//    //    /**
////     * This method processes the buy and returns the generated Invoice.
////     * @return
////     * @throws DuplicateFoundException
////     */
////    public Invoice buy() throws DuplicateFoundException{
////        Invoice generatedInvoice = invoiceService.create(lineItemList, costumer);
////        Invoice printedInvoice = invoiceService.print(generatedInvoice.getId());
////        LOGGER.log(Level.INFO, printedInvoice.toString());
////        return printedInvoice;
////    }
//}
