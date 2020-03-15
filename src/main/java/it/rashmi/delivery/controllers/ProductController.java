package it.rashmi.delivery.controllers;

import it.rashmi.delivery.model.TestModel;
import it.rashmi.delivery.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping( "/" )
public class ProductController
{
    @Autowired
    private TestService testService;

    @GetMapping()
    public List<TestModel> getName( HttpServletResponse response )
    {
//        response.addHeader( "Access-Control-Allow-Origin", "*" );
        return testService.getAllTests();
    }
}
