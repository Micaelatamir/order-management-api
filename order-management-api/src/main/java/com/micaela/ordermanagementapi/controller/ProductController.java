package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.dto.request.ProductRequestDTO;
import com.micaela.ordermanagementapi.dto.response.ProductResponseDTO;
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
 public List<ProductResponseDTO> findAll() {
  return productService.findAll()
     .stream()
     .map(ProductResponseDTO::new)
     .toList();
    }

  @GetMapping("/{id}")
   public ProductResponseDTO findById(@PathVariable Long id) {
     return new ProductResponseDTO(productService.findById(id));
    }

   @PostMapping
   public ProductResponseDTO save(@RequestBody ProductRequestDTO dto) {
     Product  product= new Product(dto.getName(), dto.getPrice());
        return new ProductResponseDTO(productService.save(product));
    }

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
    productService.delete(id);
}
}