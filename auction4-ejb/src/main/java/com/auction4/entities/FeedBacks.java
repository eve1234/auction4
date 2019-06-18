/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "feed_backs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FeedBacks.findAll", query = "SELECT f FROM FeedBacks f"),
    @NamedQuery(name = "FeedBacks.findByFeedBacksid", query = "SELECT f FROM FeedBacks f WHERE f.feedBacksid = :feedBacksid")})
public class FeedBacks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feed_backsid")
    private Integer feedBacksid;
    @Lob
    @Size(max = 16777215)
    @Column(name = "comments")
    private String comments;
    @JoinColumn(name = "sold_itemid", referencedColumnName = "sold_itemid")
    @ManyToOne(optional = false)
    private SoldItems soldItemid;

    public FeedBacks() {
    }

    public FeedBacks(Integer feedBacksid) {
        this.feedBacksid = feedBacksid;
    }

    public Integer getFeedBacksid() {
        return feedBacksid;
    }

    public void setFeedBacksid(Integer feedBacksid) {
        this.feedBacksid = feedBacksid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public SoldItems getSoldItemid() {
        return soldItemid;
    }

    public void setSoldItemid(SoldItems soldItemid) {
        this.soldItemid = soldItemid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedBacksid != null ? feedBacksid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeedBacks)) {
            return false;
        }
        FeedBacks other = (FeedBacks) object;
        if ((this.feedBacksid == null && other.feedBacksid != null) || (this.feedBacksid != null && !this.feedBacksid.equals(other.feedBacksid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.FeedBacks[ feedBacksid=" + feedBacksid + " ]";
    }
    
}
