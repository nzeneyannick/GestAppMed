package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Type;
import com.gl52.gestappmedv2.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/types")
    public List<Type> afficheListType(){
        return typeService.getAllType();
    }

    @RequestMapping("/types{nom}")
    public List<Type>afficherParNom(@PathVariable("nom")String nom){
        return typeService.getTypeByName(nom);
    }

}
