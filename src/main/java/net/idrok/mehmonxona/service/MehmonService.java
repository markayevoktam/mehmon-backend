package net.idrok.mehmonxona.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Mehmon;
import net.idrok.mehmonxona.repository.MehmonRepository;


@Service
public class MehmonService {
    @Autowired
    MehmonRepository mehmonRepo;

    public Page<Mehmon> getAll(String key, Pageable pageable) {
        return mehmonRepo.findAllByNomOrQavatContainingIgnoreCase(key, key, pageable);
    }

    public Mehmon getById(Long id) {
        return mehmonRepo.findById(id).get();
    }

    public Mehmon create(Mehmon mehmon) {
        if (mehmon.getId() == null)
       return     mehmonRepo.save(mehmon);
        throw new RuntimeException("id null bolishi kerak");
    }

    public Mehmon update(Mehmon mehmon) {
        if (mehmon.getId() != null)
         return   mehmonRepo.save(mehmon);
        throw new RuntimeException("id null bolmasligi kerak");
    }

    public void delete(Mehmon mehmon) {
        mehmonRepo.delete(mehmon);
    }

    public void deleteById(Long mehmonId) {
        mehmonRepo.deleteById(mehmonId);
    }
}
