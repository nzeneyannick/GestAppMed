package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Pret;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface pretRepository  extends CrudRepository<Pret,Long> {
    public List<Pret> findAll();
    public Optional<Pret> findById(Long id);
    public Pret save(Pret pret);
    public void deleteById(Long id);

}
