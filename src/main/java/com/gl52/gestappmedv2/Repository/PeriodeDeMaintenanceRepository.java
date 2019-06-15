package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Maintenance;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface PeriodeDeMaintenanceRepository extends CrudRepository<Maintenance, Long> {
    public List<Maintenance> findAll();
    public Optional<Maintenance> findById(Long id);
    public void deleteById(Long id);
    public Maintenance save(Maintenance e);



}
