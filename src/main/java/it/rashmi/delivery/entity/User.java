package it.rashmi.delivery.entity;

import javax.persistence.*;

@Entity
@Table( name = "user" )
public class User
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private int id;
    @Column( name = "name" )
    private String name;
    @Column( name = "address" )
    private String address;
    @Column( name = "email" )
    private String email;
    @Column( name = "password" )
    private String password;
    @Column( name = "registered" )
    private java.sql.Timestamp registered;
    @ManyToOne
    private UserLevel userLevel;


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


    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }


    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }


    public java.sql.Timestamp getRegistered()
    {
        return registered;
    }

    public void setRegistered( java.sql.Timestamp registered )
    {
        this.registered = registered;
    }


    public UserLevel getUserLevelId()
    {
        return userLevel;
    }

    public void setUserLevelId( UserLevel userLevel )
    {
        this.userLevel = userLevel;
    }

}
