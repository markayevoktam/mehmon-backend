package net.idrok.mehmonxona.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tulov")
public class Tulov {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Buyurtma buyurtma_id;

    private Long miqdor;
    private Date vaqt;
    private String info;
    public Long getId() {
        return id;
    }
    public Buyurtma getBuyurtma_id() {
        return buyurtma_id;
    }
    public void setBuyurtma_id(Buyurtma buyurtma_id) {
        this.buyurtma_id = buyurtma_id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getMiqdor() {
        return miqdor;
    }
    public void setMiqdor(Long miqdor) {
        this.miqdor = miqdor;
    }
    public Date getVaqt() {
        return vaqt;
    }
    public void setVaqt(Date vaqt) {
        this.vaqt = vaqt;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    

}

