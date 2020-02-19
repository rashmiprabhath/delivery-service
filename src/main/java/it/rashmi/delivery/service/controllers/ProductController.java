package it.rashmi.delivery.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{

    @GetMapping( "/name" )
    public String getName()
    {
        return "SL Delivery";
    }
}
