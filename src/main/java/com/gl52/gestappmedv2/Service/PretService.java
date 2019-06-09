package com.gl52.gestappmedv2.Service;

import com.gl52.gestappmedv2.Entities.Pret;
import com.gl52.gestappmedv2.Repository.PretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PretService {
    @Autowired
    PretRepository pretRepository;

    public List<Pret> getAllPret(){
        return pretRepository.findAll();
    }
    public Pret getPret(Long id){
        return pretRepository.findById(id).get();
    }

    public Pret savePret(Pret pret){
        return pretRepository.save(pret);
    }
    public String deletePret(Long id){
        pretRepository.deleteById(id);
        return "Deleted successfully id =" + id;
    }
}
