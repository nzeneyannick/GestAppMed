package com.gl52.gestappmedv2.Service;

import com.gl52.gestappmedv2.Entities.Type;
import com.gl52.gestappmedv2.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeService {
    @Autowired
    private TypeRepository typeRepository;
    public List<Type>  getAllType(){
        List<Type> listType = new ArrayList<>();
        typeRepository.findAll().forEach(listType::add);
        return listType;
    }

    public List<Type> getTypeByName(String name) {
        return typeRepository.findByNameContainsOrderByName(name);
    }

}
