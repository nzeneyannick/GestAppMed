package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Equipement;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquipementRepository extends CrudRepository<Equipement, Long> {

    public List<Equipement> findAll();

    //public Equipement findById();

    public List<Equipement> findByLastKnowsLocationOrderByName(String name);

    public List<Equipement> findByNameContainsOrderByLastKnowsLocation(String lastlocation);

    public void deleteById(Long id);

    public Equipement save(Equipement e);


}
