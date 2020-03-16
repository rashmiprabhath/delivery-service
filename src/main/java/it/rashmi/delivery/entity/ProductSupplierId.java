package it.rashmi.delivery.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductSupplierId implements Serializable
{
    @Column( name = "product_id" )
    private int productId;
    @Column( name = "supplier_id" )
    private int supplierId;

    public ProductSupplierId()
    {
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId( int productId )
    {
        this.productId = productId;
    }


    public int getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId( int supplierId )
    {
        this.supplierId = supplierId;
    }

    @Override
    public boolean equals( Object o )
    {
        if( o == this )
            return true;
        if( !( o instanceof ProductSupplierId ) )
            return false;
        ProductSupplierId productSupplierId = ( ProductSupplierId ) o;
        return ( productSupplierId.productId == this.productId &&
                         productSupplierId.supplierId == this.supplierId );
    }
}
