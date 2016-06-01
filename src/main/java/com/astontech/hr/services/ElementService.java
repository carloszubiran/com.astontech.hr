package com.astontech.hr.services;

import com.astontech.hr.domain.Element;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
public interface ElementService {

    Iterable<Element> listAllElements();

    Element getElementById(Integer id);

    Element saveElement(Element element);

    Iterable<Element> saveElementList(Iterable<Element> elementIterable);

    void deleteElement(Integer id);

    // custom repo methods

    Element findElementName(String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);

}
