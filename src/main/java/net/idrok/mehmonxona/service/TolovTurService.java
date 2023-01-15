package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.TolovTur;
import net.idrok.mehmonxona.repository.TolovTurRepository;

@Service
public class TolovTurService {
    @Autowired
    TolovTurRepository tl;



    public Page<TolovTur> getAll(String key, Pageable pageable){
        return tl.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    
    }

    public TolovTur create(TolovTur tolovTur){
        if(tolovTur.getId() == null)
            return tl.save(tolovTur);
        throw new RuntimeException(" Xato id yozilmaslik kerak");
    }

    public TolovTur update(TolovTur tolovTur){
        if (tolovTur.getId() != null)
        return tl.save(tolovTur);
    throw new RuntimeException("Id bulishi shart");
    }

    public void delete(TolovTur tolovTur){
        tl.delete(tolovTur);
    }

    public void deleteById(Long id){
        tl.deleteById(id);
    }


}
