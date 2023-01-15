package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Bino;
import net.idrok.mehmonxona.repository.BinoRepository;

@Service
public class BinoService {
    @Autowired
    BinoRepository br;


    public Page<Bino> getall(String key, Pageable pageable) {
        return br.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    public Bino create(Bino bino) {
        if (bino.getId() == null)
            return br.save(bino);
        throw new RuntimeException("xato id yozilmasligi kerak");
    }

    public Bino update(Bino bino) {
        if (bino.getId() != null)
            return br.save(bino);
        throw new RuntimeException("xato id bulishi shart");
    }

    public void delete(Bino bino) {
        br.delete(bino);
    }

    public void deleteById(Long id) {
        br.deleteById(id);
    }
}
