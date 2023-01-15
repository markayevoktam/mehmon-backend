package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Tulov;
import net.idrok.mehmonxona.repository.TulovRepository;

@Service
public class TulovService {
    @Autowired
    TulovRepository tulovRepository;

    public Page<Tulov> getall(String key, Pageable pageable) {
        return tulovRepository.findAllByMiqdorContainingIgnoreCaseOrInfoContainingIgnoreCase(key,key,pageable);
    }

    public Tulov create(Tulov tulov) {
        if (tulov.getId() == null)
            return tulovRepository.save(tulov);
        throw new RuntimeException("xato id yozilmasin");
    }

    public Tulov update(Tulov tulov) {
        if (tulov.getId() != null)
            return tulovRepository.save(tulov);
        throw new RuntimeException("xato id bulishi shart");
    }

    public void delete(Tulov tulov) {
        tulovRepository.delete(tulov);
    }

    public void deleteById(Long id) {
        tulovRepository.deleteById(id);
    }

}
