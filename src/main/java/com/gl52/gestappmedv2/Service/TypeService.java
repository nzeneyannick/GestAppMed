package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Entities.Type;
import com.gl52.gestappmedv2.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllType() {
        return (List<Type>) typeRepository.findAll();
    }

    public Type getTypeByName(String name) {
        return typeRepository.findTypeByName(name);
    }

    public Type saveOrUpdate(Type type) {
        return typeRepository.save(type);
    }

    public String deleteType(Long id) {
        typeRepository.deleteById(id);
        return "Deleted successfully id =" + id;

    }


}
