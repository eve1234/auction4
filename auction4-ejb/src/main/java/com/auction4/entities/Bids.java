/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import com.auction4.entities.*;
import com.auction4.entities.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "Bids")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bids.findAll", query = "SELECT b FROM Bids b"),
    @NamedQuery(name = "Bids.findByBidid", query = "SELECT b FROM Bids b WHERE b.bidid = :bidid"),
    @NamedQuery(name = "Bids.findByBidPrice", query = "SELECT b FROM Bids b WHERE b.bidPrice = :bidPrice"),
    @NamedQuery(name = "Bids.findByDateAndTime", query = "SELECT b FROM Bids b WHERE b.dateAndTime = :dateAndTime")})
public class Bids implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bidid")
    private Integer bidid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bid_price")
    private double bidPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_and_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTime;
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    @ManyToOne(optional = false)
    private Items itemid;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Users userid;

    public Bids() {
    }

    public Bids(Integer bidid) {
        this.bidid = bidid;
    }

    public Bids(Integer bidid, double bidPrice, Date dateAndTime) {
        this.bidid = bidid;
        this.bidPrice = bidPrice;
        this.dateAndTime = dateAndTime;
    }

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Items getItemid() {
        return itemid;
    }

    public void setItemid(Items itemid) {
        this.itemid = itemid;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bidid != null ? bidid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bids)) {
            return false;
        }
        Bids other = (Bids) object;
        if ((this.bidid == null && other.bidid != null) || (this.bidid != null && !this.bidid.equals(other.bidid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.Bids[ bidid=" + bidid + " ]";
    }
    
}
