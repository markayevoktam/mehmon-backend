package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.mehmonxona.entity.Xona;

@Repository
public interface XonaRepository extends JpaRepository<Xona, Long>{
    Page<Xona> findAllByNom(String nom, org.springframework.data.domain.Pageable pageable);
}
