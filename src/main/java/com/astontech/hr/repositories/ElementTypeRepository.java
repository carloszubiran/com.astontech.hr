package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
public interface ElementTypeRepository extends CrudRepository <ElementType, Integer> {

    // this will auto generate the required code from the structure of the method name
    ElementType findByElementTypeName(String elementTypeName);

    List<ElementType> findAllByElementTypeName(String elementTypeName);

    List<ElementType> findAllByElementTypeNameIgnoreCase(String elementTypeName);


}
