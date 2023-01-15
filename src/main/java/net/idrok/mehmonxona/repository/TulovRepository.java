package net.idrok.mehmonxona.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import net.idrok.mehmonxona.entity.Tulov;
public interface TulovRepository extends JpaRepository<Tulov, Long> {
    Page<Tulov> findAllByMiqdorContainingIgnoreCaseOrInfoContainingIgnoreCase(String key1,String key2,Pageable pageable );

}
    

