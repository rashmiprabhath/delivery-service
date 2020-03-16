package it.rashmi.delivery.entity;

import javax.persistence.*;

@Entity
@Table( name = "order_item" )
public class OrderItem
{

    @EmbeddedId
    private OrderItemId orderItemId;
    @Column(name = "quantity")
    private double quantity;
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

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity( double quantity )
    {
        this.quantity = quantity;
    }

    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setSupplier( Supplier supplier )
    {
        this.supplier = supplier;
    }


    public ItemStatus getItemStatus()
    {
        return itemStatus;
    }

    public void setItemStatus( ItemStatus itemStatus )
    {
        this.itemStatus = itemStatus;
    }

}
