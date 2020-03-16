package it.rashmi.delivery.service;

import it.rashmi.delivery.entity.ItemStatus;
import it.rashmi.delivery.model.ConfigParamModel;
import it.rashmi.delivery.repository.ItemStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConfigurationService
{
    @Autowired
    private ItemStatusRepository itemStatusRepository;

    public List<ConfigParamModel> getItemStatuses()
    {
        return itemStatusRepository.findAll().stream()
                                   .map( status -> new ConfigParamModel( status.getId(), status.getName() ) )
                                   .collect( Collectors.toList() );
    }

    public void saveItemStatus( String name )
    {
        ItemStatus itemStatus = new ItemStatus();
        itemStatus.setName( name );
        this.itemStatusRepository.save( itemStatus );
    }
}
