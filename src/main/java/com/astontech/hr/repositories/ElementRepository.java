package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
public interface ElementRepository extends CrudRepository <Element, Integer> {

    // this will auto generate the required code from the structure of the method name
    Element findByElementName(String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);


}
