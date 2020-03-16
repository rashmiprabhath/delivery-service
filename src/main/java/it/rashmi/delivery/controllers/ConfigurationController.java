package it.rashmi.delivery.controllers;

import it.rashmi.delivery.model.ConfigParamModel;
import it.rashmi.delivery.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/config" )
public class ConfigurationController
{
    @Autowired
    private ConfigurationService configurationService;

    @GetMapping( "/delivery_status" )
    public List<ConfigParamModel> getAllDeliveryStatus()
    {
        return this.configurationService.getDeliveryStatuses();
    }

    @PostMapping( "/delivery_status" )
    public void saveDeliveryStatus( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.saveDeliveryStatus( name );
    }

    @GetMapping( "/items_status" )
    public List<ConfigParamModel> getAllItemStatus()
    {
        return this.configurationService.getItemStatuses();
    }

    @PostMapping( "/items_status" )
    public void saveItemStatus( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.saveItemStatus( name );
    }

    @GetMapping( "/payment_status" )
    public List<ConfigParamModel> getAllPaymentStatuses()
    {
        return this.configurationService.getPaymentStatuses();
    }

    @PostMapping( "/payment_status" )
    public void savePaymentStatus( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.savePaymentStatus( name );
    }

    @GetMapping( "/product_type" )
    public List<ConfigParamModel> getAllProductTypes()
    {
        return this.configurationService.getProductTypes();
    }

    @PostMapping( "/product_type" )
    public void saveProductType( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.saveProductType( name );
    }

    @GetMapping( "/supplier_type" )
    public List<ConfigParamModel> getAllSupplierType()
    {
        return this.configurationService.getSupplierTypes();
    }

    @PostMapping( "/supplier_type" )
    public void saveSupplierType( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.saveSupplierType( name );
    }

    @GetMapping( "/user_level" )
    public List<ConfigParamModel> getAllUserLevel()
    {
        return this.configurationService.getUserLevels();
    }

    @PostMapping( "/user_level" )
    public void saveUserLevel( @RequestParam( value = "name" ) String name )
    {
        this.configurationService.saveUserLevel( name );
    }
}
