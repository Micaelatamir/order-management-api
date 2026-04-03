package com.micaela.ordermanagementapi.service;
import com.micaela.ordermanagementapi.model.Product;
import com.micaela.ordermanagementapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepository;

    //Buscar todos os produtos
    public List<Product> findAll() {
        return productrepository.findAll();
    }


    //Buscar produto pelo id
    public Product findById(Long id) {
        return productrepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
    }

    //salvar produto
    public Product save(Product product) {
        return productrepository.save(product);
    }

    //Deletar Produto
    public void delete(Long id) {
        productrepository.deleteById(id);
    }
}


