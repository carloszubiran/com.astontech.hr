package com.astontech.hr.domain.VO;

/**
 * Created by Carlos Zubiran on 6/1/2016.
 */
public class ElementVO {
    //region PROPERTIES

    private String newElementType;
    private String newElements;
    private String[] newElementArray;

    //endregion PROPERTIES

    //region CONSTRUCTORS
    public ElementVO() {
    }

    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS

    public String getNewElements() {
        return newElements;
    }

    public void setNewElements(String newElements) {
        this.newElements = newElements;
    }

    public String getNewElementType() {
        return newElementType;
    }

    public void setNewElementType(String newElementType) {
        this.newElementType = newElementType;
    }

    public String[] getNewElementArray() {
        return newElementArray;
    }

    public void setNewElementArray(String[] newElementArray) {
        this.newElementArray = newElementArray;
    }

    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS

    public void splitNewElementsIntoArray() {
        //regex for splitting on a newline of a carriage return is "\\r?\\n"
        this.newElementArray = this.newElements.split("\\r?\\n");
    }


    //endregion CUSTOM METHODS


}
