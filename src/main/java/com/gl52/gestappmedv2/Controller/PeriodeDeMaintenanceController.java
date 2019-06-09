package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.PeriodeDeMaintenance;
import com.gl52.gestappmedv2.Service.PeriodeDeMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class PeriodeDeMaintenanceController {
    @Autowired
    PeriodeDeMaintenanceService periodeDeMaintenanceService;

    @PostMapping("/addmaintenance")
    public PeriodeDeMaintenance addMaintenace(@RequestBody PeriodeDeMaintenance periodeDeMaintenance) {
        return periodeDeMaintenanceService.savePeriodeDeMaintance(periodeDeMaintenance);
    }

    @GetMapping("/getmaintenances")
    public List<PeriodeDeMaintenance> getAllPeriodeDeMaintenance() {
        return periodeDeMaintenanceService.getAllPeriodeDeMaintenace();
    }

    @GetMapping("/getmaintenance/{id}")
    public PeriodeDeMaintenance getMaintenanceById(@PathVariable("id") Long id) {
        return periodeDeMaintenanceService.getPeriodeDeMaintenaceById(id);
    }

    @DeleteMapping("/removemaintance/{id}")
    public String deletePeriodeMaintenance(Long id){
       return  periodeDeMaintenanceService.deletePeriodeDeMaintenance(id);
    }

}
