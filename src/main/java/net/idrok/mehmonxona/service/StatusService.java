package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Status;
import net.idrok.mehmonxona.repository.StatusRepository;

@Service
public class StatusService {
    @Autowired
    StatusRepository sr;


    public Page<Status> getall(String key, Pageable pageable) {
        return sr.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    public Status create(Status status) {
        if (status.getId() == null)
            return sr.save(status);
        throw new RuntimeException("xato id yozilmasligi kerak");
    }

    public Status update(Status status) {
        if (status.getId() != null)
            return sr.save(status);
        throw new RuntimeException("xato id bulishi shart");
    }

    public void delete(Status status) {
        sr.delete(status);
    }

    public void deleteById(Long id) {
        sr.deleteById(id);
    }
}
