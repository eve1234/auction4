/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "type_of_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeOfUsers.findAll", query = "SELECT t FROM TypeOfUsers t"),
    @NamedQuery(name = "TypeOfUsers.findByTypeOfUsersid", query = "SELECT t FROM TypeOfUsers t WHERE t.typeOfUsersid = :typeOfUsersid"),
    @NamedQuery(name = "TypeOfUsers.findByDetails", query = "SELECT t FROM TypeOfUsers t WHERE t.details = :details")})
public class TypeOfUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "type_of_usersid")
    private Integer typeOfUsersid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "details")
    private String details;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeOfUsersid")
    private List<Users> usersList;

    public TypeOfUsers() {
    }

    public TypeOfUsers(Integer typeOfUsersid) {
        this.typeOfUsersid = typeOfUsersid;
    }

    public TypeOfUsers(Integer typeOfUsersid, String details) {
        this.typeOfUsersid = typeOfUsersid;
        this.details = details;
    }

    public Integer getTypeOfUsersid() {
        return typeOfUsersid;
    }

    public void setTypeOfUsersid(Integer typeOfUsersid) {
        this.typeOfUsersid = typeOfUsersid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @XmlTransient
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeOfUsersid != null ? typeOfUsersid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeOfUsers)) {
            return false;
        }
        TypeOfUsers other = (TypeOfUsers) object;
        if ((this.typeOfUsersid == null && other.typeOfUsersid != null) || (this.typeOfUsersid != null && !this.typeOfUsersid.equals(other.typeOfUsersid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.auction4.TypeOfUsers[ typeOfUsersid=" + typeOfUsersid + " ]";
    }
    
}
