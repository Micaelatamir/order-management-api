package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.model.Product;
import com.micaela.ordermanagementapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController{


@Autowired
private ProductService productService;


@GetMapping
public List<Product> findAll(){
    return productService.findAll();
}

@GetMapping("/{id}")
public Product findByid(@PathVariable Long id){
    return productService.findById(id);
}

@PostMapping
public Product save(@RequestBody Product product) {
    return productService.save(product);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
    productService.delete(id);
}
}