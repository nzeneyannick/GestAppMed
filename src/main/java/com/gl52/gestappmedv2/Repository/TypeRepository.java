package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TypeRepository extends CrudRepository<Type, Long> {


    public List<Type> findAll();

    public Optional<Type> findById(Long id);

    public Type findTypeByName(String name);

    public void deleteById(Long id);

    public Type save(Type type);

}
