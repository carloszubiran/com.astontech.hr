package com.astontech.hr.domain;

import javax.persistence.*;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Entity
public class Element {

    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ElementId")
    private Integer id;

    @Version
    private Integer version;

    private String elementName;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public Element() {

    }

    public Element(String elementName) {
        this.elementName = elementName;
    }

    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS


    //endregion CUSTOM METHODS


}
