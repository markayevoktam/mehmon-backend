package net.idrok.mehmonxona.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Xona")
public class Xona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String qavat;
    private  String xonaTur;
    private String sigim;
    private String narx;
    private String narx_1;

    
    public Xona() {
    }

    
    public Xona(Long id, String nom, String qavat, String xonaTur, String sigim, String narx, String narx_1) {
        this.id = id;
        this.nom = nom;
        this.qavat = qavat;
        this.xonaTur = xonaTur;
        this.sigim = sigim;
        this.narx = narx;
        this.narx_1 = narx_1;
    }


    public String getXonaTur() {
        return xonaTur;
    }

    public void setXonaTur(String xonaTur) {
        this.xonaTur = xonaTur;
    }

    public String getNarx_1() {
        return narx_1;
    }

    public void setNarx_1(String narx_1) {
        this.narx_1 = narx_1;
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

    public String getNarx() {
        return narx;
    }

    public void setNarx(String narx) {
        this.narx = narx;
    }
    

}