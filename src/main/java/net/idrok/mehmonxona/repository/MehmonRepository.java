package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.idrok.mehmonxona.entity.Mehmon;

public interface MehmonRepository extends JpaRepository<Mehmon, Long> {
    Page<Mehmon> findAllByNomOrQavatContainingIgnoreCase(String k1, String k2 ,Pageable pageable);  
}