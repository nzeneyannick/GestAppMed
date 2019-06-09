package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.EtatDebut;
import com.gl52.gestappmedv2.Entities.EtatFin;
import com.gl52.gestappmedv2.Entities.PeriodeDeMaintenance;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface PeriodeDeMaintenanceRepository extends CrudRepository<PeriodeDeMaintenance, Long> {
    public List<PeriodeDeMaintenance> findAll();
    public Optional<PeriodeDeMaintenance> findById(Long id);
    //public List<PeriodeDeMaintenance> findByDateContains(Date date);
    // public List<PeriodeDeMaintenance> findByEtatDeDebutContains(EtatDebut etatDebut);
    //public List<PeriodeDeMaintenance> findByEtatDeFinContains(EtatFin etatFin);
    public void deleteById(Long id);
    public PeriodeDeMaintenance save(PeriodeDeMaintenance e);



}
