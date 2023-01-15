package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;


import net.idrok.mehmonxona.entity.Xona;
import net.idrok.mehmonxona.repository.XonaRepository;

@Service
public class XonaService {
    @Autowired
    XonaRepository xonaRepository;

    public Page<Xona> getAll(String key,  Pageable pageable){
        return xonaRepository.findAllByNom(key,  pageable);


    }
    public Xona getById(Long id) {
        return xonaRepository.findById(id).get();
    }

    public Xona create(Xona xona) {
        if (xona.getId() == null)
            return xonaRepository.save(xona);

        throw new RuntimeException("Xatolik id null bo'lishi shart");
    }

    public Xona update(Xona xona) {
        if (xona.getId() != null)
            return xonaRepository.save(xona);

        throw new RuntimeException("Xatolik id null bo'lishi shart");
    }

    public void delete(Xona xona) {
        xonaRepository.delete(xona);
    }

    public void deleteById(Long id) {
        xonaRepository.deleteById(id);
    }

}

