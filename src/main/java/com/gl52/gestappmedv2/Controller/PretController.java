package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Pret;
import com.gl52.gestappmedv2.Service.PretService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class PretController {
    private PretService pretService;

    @PostMapping("/addLoan")
    public Pret addLoan(@RequestBody Pret pret) {
        return pretService.savePret(pret);
    }

    @GetMapping("/getLoans")
    public List<Pret> getAllLoan() {
        return pretService.getAllPret();
    }

    @GetMapping("/getLoan/{id}")
    public Pret getPretById(@PathVariable("id") Long id){
        return pretService.getPret(id);
    }
    @DeleteMapping("/removeLoan/{id}")
    public String deleteLoan(Long id){
        return pretService.deletePret(id);
    }

}
