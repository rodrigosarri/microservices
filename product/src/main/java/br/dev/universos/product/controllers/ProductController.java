package br.dev.universos.product.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.universos.product.models.Product;
import br.dev.universos.product.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    Optional<Product> getById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @GetMapping(value = "/name/{name}")
    List<Product> getByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }    

}
