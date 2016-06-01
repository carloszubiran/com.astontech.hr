package com.astontech.hr.services.impl;

import com.astontech.hr.domain.ElementType;
import com.astontech.hr.repositories.ElementTypeRepository;
import com.astontech.hr.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Service
public class ElementTypeServiceImpl implements ElementTypeService {

    //region PROPERTIES

    @Autowired
    private ElementTypeRepository elementTypeRepository;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public ElementTypeServiceImpl() {
    }

    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS

    @Override
    public Iterable<ElementType> listAllElementTypes() {
        return elementTypeRepository.findAll();
    }

    @Override
    public ElementType getElementTypeById(Integer id) {
        return elementTypeRepository.findOne(id);
    }

    @Override
    public ElementType saveElementType(ElementType elementType) {
        return elementTypeRepository.save(elementType);
    }

    @Override
    public Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable) {
        return elementTypeRepository.save(elementTypeIterable);
    }

    @Override
    public void deleteElementType(Integer id) {
        elementTypeRepository.delete(id);
    }

    @Override
    public ElementType findElementTypeName(String elementTypeName) {
        return elementTypeRepository.findByElementTypeName(elementTypeName);
    }

    @Override
    public List<ElementType> findAllByElementTypeName(String elementTypeName) {
        return elementTypeRepository.findAllByElementTypeName(elementTypeName);
    }

    @Override
    public List<ElementType> findAllByElementTypeNameIgnoreCase(String elementTypeName) {
        return elementTypeRepository.findAllByElementTypeNameIgnoreCase(elementTypeName);
    }

    //endregion CUSTOM METHODS
}
