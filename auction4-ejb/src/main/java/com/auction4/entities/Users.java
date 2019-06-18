/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import com.auction4.entities.Bids;
import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserid", query = "SELECT u FROM Users u WHERE u.userid = :userid"),
    @NamedQuery(name = "Users.findByFname", query = "SELECT u FROM Users u WHERE u.fname = :fname"),
    @NamedQuery(name = "Users.findBySname", query = "SELECT u FROM Users u WHERE u.sname = :sname"),
    @NamedQuery(name = "Users.findBySex", query = "SELECT u FROM Users u WHERE u.sex = :sex"),
    @NamedQuery(name = "Users.findByMobileNum", query = "SELECT u FROM Users u WHERE u.mobileNum = :mobileNum"),
    @NamedQuery(name = "Users.findByProfileImage", query = "SELECT u FROM Users u WHERE u.profileImage = :profileImage")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "sname")
    private String sname;
    @Size(max = 6)
    @Column(name = "sex")
    private String sex;
    @Column(name = "mobile_num")
    private Integer mobileNum;
    @Size(max = 250)
    @Column(name = "profile_image")
    private String profileImage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<SoldItems> soldItemsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<Bids> bidsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<Items> itemsList;
    @JoinColumn(name = "type_of_usersid", referencedColumnName = "type_of_usersid")
    @ManyToOne(optional = false)
    private TypeOfUsers typeOfUsersid;

    public Users() {
    }

    public Users(Integer userid) {
        this.userid = userid;
    }

    public Users(Integer userid, String fname, String sname) {
        this.userid = userid;
        this.fname = fname;
        this.sname = sname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(Integer mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
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

    @XmlTransient
    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public TypeOfUsers getTypeOfUsersid() {
        return typeOfUsersid;
    }

    public void setTypeOfUsersid(TypeOfUsers typeOfUsersid) {
        this.typeOfUsersid = typeOfUsersid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.Users[ userid=" + userid + " ]";
    }
    
}
