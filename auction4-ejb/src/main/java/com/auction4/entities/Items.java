/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import com.auction4.entities.Bids;
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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i"),
    @NamedQuery(name = "Items.findByItemid", query = "SELECT i FROM Items i WHERE i.itemid = :itemid"),
    @NamedQuery(name = "Items.findByBrandName", query = "SELECT i FROM Items i WHERE i.brandName = :brandName"),
    @NamedQuery(name = "Items.findByItemName", query = "SELECT i FROM Items i WHERE i.itemName = :itemName"),
    @NamedQuery(name = "Items.findByColour", query = "SELECT i FROM Items i WHERE i.colour = :colour"),
    @NamedQuery(name = "Items.findBySize", query = "SELECT i FROM Items i WHERE i.size = :size"),
    @NamedQuery(name = "Items.findByDateAndTime", query = "SELECT i FROM Items i WHERE i.dateAndTime = :dateAndTime"),
    @NamedQuery(name = "Items.findByImage", query = "SELECT i FROM Items i WHERE i.image = :image"),
    @NamedQuery(name = "Items.findByBuyNowPrice", query = "SELECT i FROM Items i WHERE i.buyNowPrice = :buyNowPrice")})
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itemid")
    private Integer itemid;
    @Size(max = 100)
    @Column(name = "brand_name")
    private String brandName;
    @Size(max = 250)
    @Column(name = "item_name")
    private String itemName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "colour")
    private String colour;
    @Size(max = 6)
    @Column(name = "size")
    private String size;
    @Lob
    @Size(max = 16777215)
    @Column(name = "Descriptions")
    private String descriptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_and_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTime;
    @Size(max = 200)
    @Column(name = "image")
    private String image;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "buy_now_price")
    private Double buyNowPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemid")
    private List<SoldItems> soldItemsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemid")
    private List<Bids> bidsList;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Users userid;

    public Items() {
    }

    public Items(Integer itemid) {
        this.itemid = itemid;
    }

    public Items(Integer itemid, String colour, Date dateAndTime) {
        this.itemid = itemid;
        this.colour = colour;
        this.dateAndTime = dateAndTime;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(Double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    @XmlTransient
    public List<SoldItems> getSoldItemsList() {
        return soldItemsList;
    }

    public void setSoldItemsList(List<SoldItems> soldItemsList) {
        this.soldItemsList = soldItemsList;
    }

    @XmlTransient
    public List<Bids> getBidsList() {
        return bidsList;
    }

    public void setBidsList(List<Bids> bidsList) {
        this.bidsList = bidsList;
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
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.Items[ itemid=" + itemid + " ]";
    }
    
}
