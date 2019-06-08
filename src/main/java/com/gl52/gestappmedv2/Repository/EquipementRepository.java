package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Equipement;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

public interface EquipementRepository extends CrudRepository<Equipement, Long> {

    public List<Equipement> findAll();
    //public Equipement findById();
    //public Equipement findEquipementsById();
    public List<Equipement>findByLastKnowsLocationOrderByName(String name);
    public List<Equipement>findByNameContainsOrderByLastKnowsLocation(String lastlocation);
    public  void deleteById(Long id);
    public Equipement save(Equipement e);





}
