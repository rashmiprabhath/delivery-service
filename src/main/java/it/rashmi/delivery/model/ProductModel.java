package it.rashmi.delivery.model;

public class ProductModel
{
    private int id;
    private String name;
    private String brand;
    private double price;
    private ConfigParamModel productType;

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

    public ConfigParamModel getProductType()
    {
        return productType;
    }

    public void setProductType( ConfigParamModel productType )
    {
        this.productType = productType;
    }
}
