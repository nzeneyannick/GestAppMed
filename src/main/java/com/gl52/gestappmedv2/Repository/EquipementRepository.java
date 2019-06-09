package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Equipement;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EquipementRepository extends CrudRepository<Equipement, Long> {

    public List<Equipement> findAll();

    public Optional<Equipement> findById(Long id);

    public List<Equipement> findByLastKnowsLocationOrderByName(String name);

    public List<Equipement> findByNameContainsOrderByLastKnowsLocation(String lastlocation);

    public List<Equipement> findByEnMaintenanceIsFalse();

    public List<Equipement> findByEnMaintenanceIsTrue();

    public List<Equipement> findByEnPretIsTrue();

    public List<Equipement> findByEnPretIsFalse();

    public void deleteById(Long id);

    public Equipement save(Equipement e);


}
