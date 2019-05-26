package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Equipement;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

public interface EquipementRepository extends CrudRepository<Equipement, Long> {

    public List<Equipement>findAll();
    public List<Equipement>findByNameContainsOrderByName(String name);
    public List<Equipement>findEquipementsByLastKnowsLocationContainingOrderByLastKnowsLocation(String lastlocation);
    public  void deleteEquipementByUuidEquals(UUID uuid);
    public void deleteEquipementByNameEquals(String name);


}
