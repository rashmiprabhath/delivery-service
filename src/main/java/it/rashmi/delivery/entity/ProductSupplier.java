package it.rashmi.delivery.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "product_supplier" )
public class ProductSupplier
{

    @EmbeddedId
    private ProductSupplierId id;

    public ProductSupplierId getId()
    {
        return id;
    }

    public void setId( ProductSupplierId id )
    {
        this.id = id;
    }
}
