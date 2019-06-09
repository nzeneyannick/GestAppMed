package com.gl52.gestappmedv2.Service;

import com.gl52.gestappmedv2.Entities.Type;
import com.gl52.gestappmedv2.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllType() {
        return (List<Type>) typeRepository.findAll();
    }

    public Type getById(Long id) {
        return typeRepository.findById(id).get();
    }

    public Type getTypeByName(String name) {
        return typeRepository.findTypeByName(name);
    }

    public Long saveOrUpdate(Type type) {
        return typeRepository.save(type).getId();
    }

    public void deleteType(Long id) {
        typeRepository.deleteById(id);

    }


}
