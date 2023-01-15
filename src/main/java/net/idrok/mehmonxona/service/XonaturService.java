package net.idrok.mehmonxona.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.mehmonxona.entity.XonaTur;
import net.idrok.mehmonxona.repository.XonaTurRepository;

@Service
public class XonaturService {
    @Autowired
    XonaTurRepository xt;

    public Page<XonaTur> getAll(String key, Pageable pageable) {
        return xt.findByIdAndDarajaContainingIgnoreCase(key, key, pageable);
    }

    public XonaTur getById(Long id) {
        return (XonaTur) xt.findById(id).get();
    }

    public XonaTur create(XonaTur tur) {
        if (tur.getId() == null)
         return     xt.save(tur);
        throw new RuntimeException("id bo'sh bolishi kerak");
    }

    public XonaTur update(XonaTur xonatur) {

        if (xonatur.getId() != null)
         return   xt.save(xonatur);
         throw new RuntimeException
         ("id bo'sh bolmasligi kerak");
    }

    public void delete(XonaTur XonaTur) {
        xt.delete(XonaTur);
    }

    public void deleteById(Long XonaTurId) {
        xt.deleteById(XonaTurId);
    }
}