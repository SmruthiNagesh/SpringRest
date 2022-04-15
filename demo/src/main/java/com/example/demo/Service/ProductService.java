package com.example.demo.Service;


import com.example.demo.Bean.Product;
import com.example.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getallproducts(){
        List<Product> productList = new ArrayList<>();
        repository.findAll().forEach(x->productList.add(x));
        return productList;
    }

    public Product getProductById(int id){
        return repository.findById(id).get();
    }

    public Product addProduct(Product product){
        Product p = repository.save(product);
        return p;
    }

    public Product updateProduct(Product product) {
        Product p = repository.save(product);
        return p;
    }

    public void deleteProductById(int id) {
        repository.deleteById(id);
    }
}
