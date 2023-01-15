package net.idrok.mehmonxona.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "buyurtma")
public class Buyurtma {
    


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Xona xona;

    @ManyToOne
    private Xodim xodim;

    @ManyToOne 
    private Status status;

    private Date boshvaqt;
    private Date tugvaqt; 
    private String info;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Xona getXona() {
        return xona;
    }
    public void setXona(Xona xona) {
        this.xona = xona;
    }
    public Xodim getXodim() {
        return xodim;
    }
    public void setXodim(Xodim xodim) {
        this.xodim = xodim;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Date getBoshvaqt() {
        return boshvaqt;
    }
    public void setBoshvaqt(Date boshvaqt) {
        this.boshvaqt = boshvaqt;
    }
    public Date getTugvaqt() {
        return tugvaqt;
    }
    public void setTugvaqt(Date tugvaqt) {
        this.tugvaqt = tugvaqt;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
   



    
}
