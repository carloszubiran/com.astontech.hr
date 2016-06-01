package com.astontech.hr.services.impl;

import com.astontech.hr.domain.Element;
import com.astontech.hr.repositories.ElementRepository;
import com.astontech.hr.services.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Service
public class ElementServiceImpl implements ElementService {

    //region PROPERTIES

    @Autowired
    private ElementRepository elementRepository;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public ElementServiceImpl() {
    }

    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS

    @Override
    public Iterable<Element> listAllElements() {
        return elementRepository.findAll();
    }

    @Override
    public Element getElementById(Integer id) {
        return elementRepository.findOne(id);
    }

    @Override
    public Element saveElement(Element element) {
        return elementRepository.save(element);
    }

    @Override
    public Iterable<Element> saveElementList(Iterable<Element> elementIterable) {
        return elementRepository.save(elementIterable);
    }

    @Override
    public void deleteElement(Integer id) {
        elementRepository.delete(id);
    }

    @Override
    public Element findElementName(String elementName) {
        return elementRepository.findByElementName(elementName);
    }

    @Override
    public List<Element> findAllByElementName(String elementName) {
        return elementRepository.findAllByElementName(elementName);
    }

    @Override
    public List<Element> findAllByElementNameIgnoreCase(String elementName) {
        return elementRepository.findAllByElementNameIgnoreCase(elementName);
    }

    //endregion CUSTOM METHODS
}
