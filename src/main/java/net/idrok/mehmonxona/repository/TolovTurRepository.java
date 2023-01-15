package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.mehmonxona.entity.TolovTur;
@Repository
public interface TolovTurRepository extends JpaRepository<TolovTur,Long>{
    Page<TolovTur> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String key, String key2, org.springframework.data.domain.Pageable pageable);
}
