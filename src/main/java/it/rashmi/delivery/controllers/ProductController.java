package it.rashmi.delivery.controllers;

import it.rashmi.delivery.model.ProductModel;
import it.rashmi.delivery.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/product" )
public class ProductController
{
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductModel> getAllProducts()
    {
        return this.productService.getAllProducts();
    }

    @PostMapping
    public void saveProduct( @RequestBody ProductModel productModel )
    {
        this.productService.saveProduct( productModel );
    }
}
