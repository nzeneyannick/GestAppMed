package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeRepository extends CrudRepository<Type, Long> {

    public List<Type>findAll();
    public List<Type> findByNameContainsOrderByName(String name);
}
