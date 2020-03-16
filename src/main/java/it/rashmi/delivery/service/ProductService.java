package it.rashmi.delivery.service;

import it.rashmi.delivery.entity.Product;
import it.rashmi.delivery.entity.ProductType;
import it.rashmi.delivery.model.ConfigParamModel;
import it.rashmi.delivery.model.ProductModel;
import it.rashmi.delivery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts()
    {
        return this.productRepository.findAll().stream()
                                     .map( this::convertToProductModel )
                                     .collect( Collectors.toList() );
    }

    public void saveProduct( ProductModel productModel )
    {
        this.productRepository.save( convertToProduct( productModel ) );
    }

    private ProductModel convertToProductModel( Product product )
    {
        ProductModel productModel = new ProductModel();
        productModel.setId( product.getId() );
        productModel.setName( product.getName() );
        productModel.setBrand( product.getBrand() );
        productModel.setPrice( product.getPrice() );
        productModel.setProductType( new ConfigParamModel( product.getProductType().getId(), product.getProductType().getName() ) );
        return productModel;
    }

    private Product convertToProduct( ProductModel productModel )
    {
        Product product = new Product();
        ProductType productType = new ProductType();
        product.setName( productModel.getName() );
        product.setBrand( productModel.getBrand() );
        product.setPrice( productModel.getPrice() );

        productType.setId( productModel.getProductType().getId() );
        productType.setName( productModel.getProductType().getName() );

        product.setProductType( productType );
        return product;
    }
}
