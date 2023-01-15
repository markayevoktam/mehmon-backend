package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import net.idrok.mehmonxona.entity.XonaTur;
@Repository
public class XonaTurRepository {

    public Page<XonaTur> findByIdAndDarajaContainingIgnoreCase(String key, String key2, Pageable pageable) {
        return null;
    }

    public Streamable<XonaTur> findById(Long id) {
        return null;
    }

    public XonaTur save(XonaTur xonaTur) {
        return null;
    }

    public void delete(XonaTur xonaTur) {
    }

    public void deleteById(Long xonaTurId) {
    }
    
}
