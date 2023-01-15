package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.mehmonxona.entity.Buyurtma;

@Repository
public interface BuyurtmaRepository extends JpaRepository<Buyurtma, Long> {
    Page<Buyurtma> findAllByInfoContainingIgnoreCase(String k1, Pageable pageable);
    
}
