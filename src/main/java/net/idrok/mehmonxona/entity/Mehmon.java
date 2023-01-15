package net.idrok.mehmonxona.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mehmon")
public class Mehmon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String qavat;
    private String sigim;
    private String xonaTur;
    private String narx;
    private String narx_1;
    private String info;

    @ManyToOne
    private Fayl rasm;

    
    public Mehmon() {
    }
    public Mehmon(Long id, String nom, String qavat, String sigim, String xonaTur, String narx, String narx_1,
            String info) {
        this.id = id;
        this.nom = nom;
        this.qavat = qavat;
        this.sigim = sigim;
        this.xonaTur = xonaTur;
        this.narx = narx;
        this.narx_1 = narx_1;
        this.info = info;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getQavat() {
        return qavat;
    }
    public void setQavat(String qavat) {
        this.qavat = qavat;
    }
    public String getSigim() {
        return sigim;
    }
    public void setSigim(String sigim) {
        this.sigim = sigim;
    }
    public String getXonaTur() {
        return xonaTur;
    }
    public void setXonaTur(String xonaTur) {
        this.xonaTur = xonaTur;
    }
    public String getNarx() {
        return narx;
    }
    public void setNarx(String narx) {
        this.narx = narx;
    }
    public String getNarx_1() {
        return narx_1;
    }
    public void setNarx_1(String narx_1) {
        this.narx_1 = narx_1;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    
    
}
