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
@Table(name = "buyer_item_ratings_and_reviews")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BuyerItemRatingsAndReviews.findAll", query = "SELECT b FROM BuyerItemRatingsAndReviews b"),
    @NamedQuery(name = "BuyerItemRatingsAndReviews.findByBuyerItemRatingsAndReviewsid", query = "SELECT b FROM BuyerItemRatingsAndReviews b WHERE b.buyerItemRatingsAndReviewsid = :buyerItemRatingsAndReviewsid"),
    @NamedQuery(name = "BuyerItemRatingsAndReviews.findByRatings", query = "SELECT b FROM BuyerItemRatingsAndReviews b WHERE b.ratings = :ratings")})
public class BuyerItemRatingsAndReviews implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "buyer_item_ratings_and_reviewsid")
    private Integer buyerItemRatingsAndReviewsid;
    @Column(name = "ratings")
    private Integer ratings;
    @Lob
    @Size(max = 16777215)
    @Column(name = "review_comments")
    private String reviewComments;
    @JoinColumn(name = "sold_itemid", referencedColumnName = "sold_itemid")
    @ManyToOne(optional = false)
    private SoldItems soldItemid;

    public BuyerItemRatingsAndReviews() {
    }

    public BuyerItemRatingsAndReviews(Integer buyerItemRatingsAndReviewsid) {
        this.buyerItemRatingsAndReviewsid = buyerItemRatingsAndReviewsid;
    }

    public Integer getBuyerItemRatingsAndReviewsid() {
        return buyerItemRatingsAndReviewsid;
    }

    public void setBuyerItemRatingsAndReviewsid(Integer buyerItemRatingsAndReviewsid) {
        this.buyerItemRatingsAndReviewsid = buyerItemRatingsAndReviewsid;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
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
        hash += (buyerItemRatingsAndReviewsid != null ? buyerItemRatingsAndReviewsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyerItemRatingsAndReviews)) {
            return false;
        }
        BuyerItemRatingsAndReviews other = (BuyerItemRatingsAndReviews) object;
        if ((this.buyerItemRatingsAndReviewsid == null && other.buyerItemRatingsAndReviewsid != null) || (this.buyerItemRatingsAndReviewsid != null && !this.buyerItemRatingsAndReviewsid.equals(other.buyerItemRatingsAndReviewsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.BuyerItemRatingsAndReviews[ buyerItemRatingsAndReviewsid=" + buyerItemRatingsAndReviewsid + " ]";
    }
    
}
