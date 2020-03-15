package it.rashmi.delivery.controllers;

import it.rashmi.delivery.model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping( "/" )
public class ProductController
{

    @GetMapping( )
    public TestModel getName( HttpServletResponse response)
    {
//        response.addHeader( "Access-Control-Allow-Origin", "*" );
        return new TestModel( 0, "Rashmi" );
    }
}
