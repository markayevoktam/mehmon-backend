package net.idrok.mehmonxona.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xodim")
public class Xodim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true,nullable = false)
    private String ism;
    @Column(length = 30, unique = true,nullable = false)
    private String familya;
    @Column(length = 30, unique = true,nullable = false)
    private String sharif;
    @Column(length = 30, unique = true,nullable = false)
    private String telefon;
    @Column(length = 30, unique = true,nullable = false)
    private String email;

    @Column(length = 30, unique = true,nullable = false)
    private String manzil;
    @Column(length = 30, unique = true,nullable = false)
    private String login;
    private Long parol;
    private Long maosh;
    private String malumot;
    
    public Xodim(){
        
    }

    public Xodim(Long id, String ism, String familya, String sharif, String telefon, String email, String manzil,
            String login, Long parol, Long maosh, String malumot) {
        this.id = id;
        this.ism = ism;
        this.familya = familya;
        this.sharif = sharif;
        this.telefon = telefon;
        this.email = email;
        this.manzil = manzil;
        this.login = login;
        this.parol = parol;
        this.maosh = maosh;
        this.malumot = malumot;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIsm() {
        return ism;
    }
    public void setIsm(String ism) {
        this.ism = ism;
    }
    public String getFamilya() {
        return familya;
    }
    public void setFamilya(String familya) {
        this.familya = familya;
    }
    public String getSharif() {
        return sharif;
    }
    public void setSharif(String sharif) {
        this.sharif = sharif;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getManzil() {
        return manzil;
    }
    public void setManzil(String manzil) {
        this.manzil = manzil;
    }
  
   
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public Long getParol() {
        return parol;
    }
    public void setParol(Long parol) {
        this.parol = parol;
    }
    public Long getMaosh() {
        return maosh;
    }
    public void setMaosh(Long maosh) {
        this.maosh = maosh;
    }
    public String getMalumot() {
        return malumot;
    }
    public void setMalumot(String malumot) {
        this.malumot = malumot;
    }
}



