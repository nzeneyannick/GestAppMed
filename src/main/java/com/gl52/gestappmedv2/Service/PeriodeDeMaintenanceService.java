package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.PeriodeDeMaintenance;
import com.gl52.gestappmedv2.Repository.PeriodeDeMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PeriodeDeMaintenanceService {
    @Autowired
    PeriodeDeMaintenanceRepository periodeDeMaintenanceRepository;

    public List<PeriodeDeMaintenance> getAllPeriodeDeMaintenace() {
        return periodeDeMaintenanceRepository.findAll();
    }

    public PeriodeDeMaintenance getPeriodeDeMaintenaceById(Long id) {
        return periodeDeMaintenanceRepository.findById(id).get();
    }

    public Long savePeriodeDeMaintance(PeriodeDeMaintenance periodeDeMaintenance) {
        return periodeDeMaintenanceRepository.save(periodeDeMaintenance).getId();
    }

    public void deletePeriodeDeMaintenance(Long id) {
        periodeDeMaintenanceRepository.deleteById(id);
    }
}
