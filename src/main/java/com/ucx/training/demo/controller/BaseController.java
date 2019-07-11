package com.ucx.training.demo.controller;

import com.ucx.training.demo.entity.BaseModel;
import com.ucx.training.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T extends BaseModel<U>,U> {

    @Autowired
    private BaseService<T,U> baseService;;

    @PostMapping
    public T create(@RequestBody T t){
        return baseService.save(t);
    }

    @PutMapping("{id}")
    public T update(@RequestBody T t, @PathVariable U id) {
        return baseService.update(t, id);
    }

    @DeleteMapping("{id}")
    public void remove(@PathVariable U id) {
        baseService.remove(id);
    }

    @GetMapping
    public List<T> findAllSorted(@RequestParam(required = false, defaultValue = "ASC") String direction, @RequestParam(defaultValue = "id") String ... properties) {
        return baseService.findAllSorted(direction, properties);
    }

    @GetMapping("{id}")
    public T findById(@PathVariable U id) { return baseService.findById(id);}

    @GetMapping("/paged")
    public List<T> findAllPaged(@RequestParam int pageNumber, @RequestParam int pageSize) {
        Page<T> costumerPage = baseService.findAllPaged(pageNumber, pageSize);
        return costumerPage.getContent();
    }
}
