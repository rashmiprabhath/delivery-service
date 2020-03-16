package it.rashmi.delivery.entity;

import javax.persistence.*;

@Entity
@Table( name = "order" )
public class Order
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;
    @Column( name = "ordered_date" )
    private java.sql.Timestamp orderedDate;
    @Column( name = "required_date" )
    private java.sql.Timestamp requiredDate;
    @ManyToOne
    private PaymentStatus paymentStatus;
    @ManyToOne
    private DeliveryStatus deliveryStatus;
    @ManyToOne
    private User user;


    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }


    public java.sql.Timestamp getOrderedDate()
    {
        return orderedDate;
    }

    public void setOrderedDate( java.sql.Timestamp orderedDate )
    {
        this.orderedDate = orderedDate;
    }


    public java.sql.Timestamp getRequiredDate()
    {
        return requiredDate;
    }

    public void setRequiredDate( java.sql.Timestamp requiredDate )
    {
        this.requiredDate = requiredDate;
    }


    public PaymentStatus getPaymentStatusId()
    {
        return paymentStatus;
    }

    public void setPaymentStatusId( PaymentStatus paymentStatus )
    {
        this.paymentStatus = paymentStatus;
    }


    public DeliveryStatus getDeliveryStatus()
    {
        return deliveryStatus;
    }

    public void setDeliveryStatus( DeliveryStatus deliveryStatus )
    {
        this.deliveryStatus = deliveryStatus;
    }


    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }
}
