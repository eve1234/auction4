/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "sold_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoldItems.findAll", query = "SELECT s FROM SoldItems s"),
    @NamedQuery(name = "SoldItems.findBySoldItemid", query = "SELECT s FROM SoldItems s WHERE s.soldItemid = :soldItemid"),
    @NamedQuery(name = "SoldItems.findByDateAndTimeWhenItemSold", query = "SELECT s FROM SoldItems s WHERE s.dateAndTimeWhenItemSold = :dateAndTimeWhenItemSold")})
public class SoldItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sold_itemid")
    private Integer soldItemid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_and_time_when_item_sold")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTimeWhenItemSold;
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    @ManyToOne(optional = false)
    private Items itemid;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Users userid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "soldItemid")
    private List<FeedBacks> feedBacksList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "soldItemid")
    private List<BuyerItemRatingsAndReviews> buyerItemRatingsAndReviewsList;

    public SoldItems() {
    }

    public SoldItems(Integer soldItemid) {
        this.soldItemid = soldItemid;
    }

    public SoldItems(Integer soldItemid, Date dateAndTimeWhenItemSold) {
        this.soldItemid = soldItemid;
        this.dateAndTimeWhenItemSold = dateAndTimeWhenItemSold;
    }

    public Integer getSoldItemid() {
        return soldItemid;
    }

    public void setSoldItemid(Integer soldItemid) {
        this.soldItemid = soldItemid;
    }

    public Date getDateAndTimeWhenItemSold() {
        return dateAndTimeWhenItemSold;
    }

    public void setDateAndTimeWhenItemSold(Date dateAndTimeWhenItemSold) {
        this.dateAndTimeWhenItemSold = dateAndTimeWhenItemSold;
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

    @XmlTransient
    public List<FeedBacks> getFeedBacksList() {
        return feedBacksList;
    }

    public void setFeedBacksList(List<FeedBacks> feedBacksList) {
        this.feedBacksList = feedBacksList;
    }

    @XmlTransient
    public List<BuyerItemRatingsAndReviews> getBuyerItemRatingsAndReviewsList() {
        return buyerItemRatingsAndReviewsList;
    }

    public void setBuyerItemRatingsAndReviewsList(List<BuyerItemRatingsAndReviews> buyerItemRatingsAndReviewsList) {
        this.buyerItemRatingsAndReviewsList = buyerItemRatingsAndReviewsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (soldItemid != null ? soldItemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoldItems)) {
            return false;
        }
        SoldItems other = (SoldItems) object;
        if ((this.soldItemid == null && other.soldItemid != null) || (this.soldItemid != null && !this.soldItemid.equals(other.soldItemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.SoldItems[ soldItemid=" + soldItemid + " ]";
    }
    
}
