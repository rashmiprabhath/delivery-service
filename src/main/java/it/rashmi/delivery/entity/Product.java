package it.rashmi.delivery.entity;

import javax.persistence.*;

@Entity
@Table( name = "product" )
public class Product
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;
    @Column( name = "name" )
    private String name;
    @Column( name = "brand" )
    private String brand;
    @Column( name = "price" )
    private double price;
    @ManyToOne
    private ProductType productType;


    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }


    public String getBrand()
    {
        return brand;
    }

    public void setBrand( String brand )
    {
        this.brand = brand;
    }


    public double getPrice()
    {
        return price;
    }

    public void setPrice( double price )
    {
        this.price = price;
    }


    public ProductType getProductType()
    {
        return productType;
    }

    public void setProductType( ProductType productType )
    {
        this.productType = productType;
    }

}
