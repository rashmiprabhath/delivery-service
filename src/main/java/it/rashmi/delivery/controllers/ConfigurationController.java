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
}
