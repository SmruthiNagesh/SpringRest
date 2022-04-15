package com.example.demo.Controller;

import com.example.demo.Bean.Product;
import com.example.demo.ProductRepository;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/getallproducts")
    List<Product> getproduct(){
        return service.getallproducts();
    }

    @GetMapping("/getproductbyid/{id}")
    Product getProductById(@PathVariable("id") int id){
        return service.getProductById(id);
    }

    @PostMapping("/addproduct")
    Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @PutMapping("/updateproduct")
    Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteproductbyid/{id}")
    String deleteProductById(@PathVariable("id") int id){
        service.deleteProductById(id);
        return "Product removed successfully.";
    }
}

