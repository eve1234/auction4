/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.sessionBeans;

import com.auction4.entities.TypeOfUsers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yvonneak
 */
@Stateless
public class TypeOfUsersFacade extends AbstractFacade<TypeOfUsers> {

    @PersistenceContext(unitName = "com.auction4_auction4-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeOfUsersFacade() {
        super(TypeOfUsers.class);
    }
    
}
