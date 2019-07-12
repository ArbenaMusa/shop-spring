package com.ucx.training.demo.controller;

import com.ucx.training.demo.entity.LineItem;
import com.ucx.training.demo.service.LineItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shop/lineItems")
public class LineItemController extends BaseController<LineItem, Integer> {
    LineItemService lineItemService;

//    @PostMapping
//    public void addToCart(@PathVariable Integer id, @RequestBody LineItem lineItem) {
//        lineItem.setCustomerId(id);
//        lineItemService.save(lineItem);
//    }
}
