package net.idrok.mehmonxona.repository;

import net.idrok.mehmonxona.entity.Fayl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Fayl, Long> {

}
