package com.astontech.hr.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Entity
public class ElementType {

    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ElementTypeId")
    private Integer id;

    @Version
    private Integer version;

    private String elementTypeName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Element> elementList;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public ElementType() {
    }

    public ElementType(String elementTypeName) {
        this.elementTypeName = elementTypeName;
    }

    public ElementType(String elementTypeName, List<Element> elementList) {
        this.elementTypeName = elementTypeName;
        this.elementList = elementList;
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

    public String getElementTypeName() {
        return elementTypeName;
    }

    public void setElementTypeName(String elementTypeName) {
        this.elementTypeName = elementTypeName;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS


    //endregion CUSTOM METHODS


}
