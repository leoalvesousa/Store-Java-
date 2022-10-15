package org.store.rest.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    String find(){
        return "produto";
    }

    @GetMapping("/{id}")
    String findById(@PathVariable Long id){
        return "produtoId " + id.toString();
    }

    @PostMapping
    String create(@RequestBody String value){
        return " Criou o produto" ;
    }

    @PutMapping
    void update(@RequestBody String value){}

    @DeleteMapping
    void delete(@PathVariable Long id){}
}
