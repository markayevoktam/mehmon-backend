package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.mehmonxona.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    Page<Status> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String k1, String k2, Pageable pageable);
    
}
