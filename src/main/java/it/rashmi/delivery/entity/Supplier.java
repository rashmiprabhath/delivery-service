package it.rashmi.delivery.entity;

import javax.persistence.*;

@Entity
@Table( name = "supplier" )
public class Supplier
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;
    @Column( name = "name" )
    private String name;
    @Column( name = "address" )
    private String address;
    @ManyToOne
    private SupplierType supplierType;


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


    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }


    public SupplierType getSupplierTypeId()
    {
        return supplierType;
    }

    public void setSupplierTypeId( SupplierType supplierType )
    {
        this.supplierType = supplierType;
    }

}
