package net.idrok.mehmonxona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Buyurtma;
import net.idrok.mehmonxona.repository.BuyurtmaRepository;

@Service
public class BuyurtmaService {
    
    @Autowired
    BuyurtmaRepository br;


    public Page<Buyurtma> getall(String key, Pageable pageable) {
        return br.findAllByInfoContainingIgnoreCase(key,  pageable);
    }

    public Buyurtma getById(Long id) {
        return br.findById(id).get();
    }

    public Buyurtma create(Buyurtma buyurtma) {
        if (buyurtma.getId() == null)
            return br.save(buyurtma);
        throw new RuntimeException(" id yozilmasligi kerak");
    }

    public Buyurtma update(Buyurtma buyurtma) {
        if (buyurtma.getId() != null)
            return br.save(buyurtma);
        throw new RuntimeException("id bulishi shart");
    }

    public void delete(Buyurtma buyurtma) {
        br.delete(buyurtma);
    }

    public void deleteById(Long id) {
        br.deleteById(id);
    }
}
