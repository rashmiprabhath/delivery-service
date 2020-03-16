package it.rashmi.delivery.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderItemId implements Serializable
{
    @Column( name = "product_id" )
    private int productId;
    @Column( name = "order_item_id" )
    private int orderItemId;

    public OrderItemId()
    {
    }

    public OrderItemId( int productId, int orderItemId )
    {
        this.productId = productId;
        this.orderItemId = orderItemId;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId( int productId )
    {
        this.productId = productId;
    }

    public long getOrderItemId()
    {
        return orderItemId;
    }

    public void setOrderItemId( int orderItemId )
    {
        this.orderItemId = orderItemId;
    }

    @Override
    public boolean equals( Object o )
    {
        if( o == this )
            return true;
        if( !( o instanceof OrderItemId ) )
            return false;
        OrderItemId orderItemId = ( OrderItemId ) o;
        return ( orderItemId.productId == this.productId &&
                         orderItemId.orderItemId == this.orderItemId );
    }
}
