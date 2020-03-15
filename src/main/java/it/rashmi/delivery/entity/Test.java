package it.rashmi.delivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "TEST" )
public class Test
{
    @Id
    @Column( name = "ID" )
    private Long ID;

    @Column( name = "NAME" )
    private String name;

    public long getID()
    {
        return ID;
    }

    public void setID( long ID )
    {
        this.ID = ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
