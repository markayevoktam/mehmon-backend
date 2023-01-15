package net.idrok.mehmonxona.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.idrok.mehmonxona.entity.Xodim;

public interface XodimRepository extends JpaRepository<Xodim, Long> {
  Page <Xodim>  findAllByIsmOrFamilyaOrSharifOrTelefonOrEmailOrManzilOrLoginOrMalumotContainingIgnoreCase(String ism,  String familya, String sharif,String telefon, String email, String manzil, String login,  String malumot, Pageable pageable);
}