package it.rashmi.delivery.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "order_item" )
public class OrderItem
{

    @EmbeddedId
    private OrderItemId orderItemId;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private ItemStatus itemStatus;

    public OrderItemId getOrderItemId()
    {
        return orderItemId;
    }

    public void setOrderItemId( OrderItemId orderItemId )
    {
        this.orderItemId = orderItemId;
    }

    public Supplier getSupplierId()
    {
        return supplier;
    }

    public void setSupplierId( Supplier supplier )
    {
        this.supplier = supplier;
    }


    public ItemStatus getItemStatusId()
    {
        return itemStatus;
    }

    public void setItemStatusId( ItemStatus itemStatus )
    {
        this.itemStatus = itemStatus;
    }

}
