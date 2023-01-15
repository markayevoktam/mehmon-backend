package net.idrok.mehmonxona.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.Xodim;
import net.idrok.mehmonxona.repository.XodimRepository;

@Service
public class XodimService {

    @Autowired
    XodimRepository xodimRepository;

    public Page<Xodim> getAll(String key, Pageable pageable){
        return xodimRepository.findAllByIsmOrFamilyaOrSharifOrTelefonOrEmailOrManzilOrLoginOrMalumotContainingIgnoreCase( key, key, key, key, key, key, key, key, pageable);
    }
    public Xodim getById(Long Id) {
        return xodimRepository.findById(Id).get();
    }
    public Xodim create(Xodim Xodim) {
        if (Xodim.getId() == null)
            return xodimRepository.save(Xodim);
        throw new RuntimeException("Xatolik null bolishi shart ");
    }
    public Xodim update(Xodim Xodim) {
        if (Xodim.getId() != null)
            return xodimRepository.save(Xodim);
        return null;
    }
    public void delete(Xodim Xodim) {
        xodimRepository.delete(Xodim);
    }

    public void deleteById(Long id) {
        xodimRepository.deleteById(id);
    }

}
