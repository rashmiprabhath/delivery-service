package it.rashmi.delivery.service;

import it.rashmi.delivery.entity.*;
import it.rashmi.delivery.model.ConfigParamModel;
import it.rashmi.delivery.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConfigurationService
{
    @Autowired
    private DeliveryStatusRepository deliveryStatusRepository;
    @Autowired
    private ItemStatusRepository itemStatusRepository;
    @Autowired
    private PaymentStatusRepository paymentStatusRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private SupplierTypeRepository supplierTypeRepository;
    @Autowired
    private UserLevelRepository userLevelRepository;

    /**
     * ------------ delivery status services ----------------
     */

    public List<ConfigParamModel> getDeliveryStatuses()
    {
        return deliveryStatusRepository.findAll().stream()
                                       .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                       .collect( Collectors.toList() );
    }

    public void saveDeliveryStatus( String name )
    {
        DeliveryStatus deliveryStatus = new DeliveryStatus();
        deliveryStatus.setName( name );
        this.deliveryStatusRepository.save( deliveryStatus );
    }

    /**
     * ------------ item status services ----------------
     */

    public List<ConfigParamModel> getItemStatuses()
    {
        return itemStatusRepository.findAll().stream()
                                   .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                   .collect( Collectors.toList() );
    }

    public void saveItemStatus( String name )
    {
        ItemStatus itemStatus = new ItemStatus();
        itemStatus.setName( name );
        this.itemStatusRepository.save( itemStatus );
    }

    /**
     * ------------ payment status services ----------------
     */

    public List<ConfigParamModel> getPaymentStatuses()
    {
        return paymentStatusRepository.findAll().stream()
                                      .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                      .collect( Collectors.toList() );
    }

    public void savePaymentStatus( String name )
    {
        PaymentStatus paymentStatus = new PaymentStatus();
        paymentStatus.setName( name );
        this.paymentStatusRepository.save( paymentStatus );
    }

    /**
     * ------------ product type services ----------------
     */

    public List<ConfigParamModel> getProductTypes()
    {
        return productTypeRepository.findAll().stream()
                                    .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                    .collect( Collectors.toList() );
    }

    public void saveProductType( String name )
    {
        ProductType productType = new ProductType();
        productType.setName( name );
        this.productTypeRepository.save( productType );
    }

    /**
     * ------------ supplier type services ----------------
     */

    public List<ConfigParamModel> getSupplierTypes()
    {
        return supplierTypeRepository.findAll().stream()
                                     .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                     .collect( Collectors.toList() );
    }

    public void saveSupplierType( String name )
    {
        SupplierType supplierType = new SupplierType();
        supplierType.setName( name );
        this.supplierTypeRepository.save( supplierType );
    }

    /**
     * ------------ user level services ----------------
     */

    public List<ConfigParamModel> getUserLevels()
    {
        return userLevelRepository.findAll().stream()
                                  .map( config -> new ConfigParamModel( config.getId(), config.getName() ) )
                                  .collect( Collectors.toList() );
    }

    public void saveUserLevel( String name )
    {
        UserLevel userLevel = new UserLevel();
        userLevel.setName( name );
        this.userLevelRepository.save( userLevel );
    }

}
