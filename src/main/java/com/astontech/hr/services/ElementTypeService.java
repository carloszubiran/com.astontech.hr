package com.astontech.hr.services;

import com.astontech.hr.domain.ElementType;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
public interface ElementTypeService {

    Iterable<ElementType> listAllElementTypes();

    ElementType getElementTypeById(Integer id);

    ElementType saveElementType(ElementType elementType);

    Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable);

    void deleteElementType(Integer id);

    // custom repo methods

    ElementType findElementTypeName(String elementTypeName);

    List<ElementType> findAllByElementTypeName(String elementTypeName);

    List<ElementType> findAllByElementTypeNameIgnoreCase(String elementTypeName);


}
