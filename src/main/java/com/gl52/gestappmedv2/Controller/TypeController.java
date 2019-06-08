package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Type;
import com.gl52.gestappmedv2.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class TypeController {

   @Autowired
    private TypeService typeService;

   @PostMapping("/saveType")
   public Type save(@RequestBody Type type){
       return typeService.saveOrUpdate(type);
   }

    @GetMapping("/types")
    public List<Type> afficheListType(){
        return typeService.getAllType();
    }

    @GetMapping("/types/{nom}")
    public Type afficherParNom(@PathVariable("nom")String nom){
        return typeService.getTypeByName(nom);
    }

    @DeleteMapping("/deleteType/{id}")
    public void deleteType(@PathVariable Long id ) {
       typeService.deleteType(id);
    }

}

