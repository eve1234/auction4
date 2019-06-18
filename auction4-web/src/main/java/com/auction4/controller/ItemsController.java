/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import com.auction4.entities.*;
import com.auction4.sessionBeans.*;

/**
 *
 * @author yvonneak
 */
@Named(value = "itemsController")
@SessionScoped
public class ItemsController implements Serializable {

    @EJB
    private ItemsFacade itemsFacade;
    private Items i=new Items();

    public Items getI() {
        return i;
    }

    public void setI(Items i) {
        this.i = i;
    }
    
    
    /**
     * Creates a new instance of ItemsController
     */
    public ItemsController() {
    }
    
    
    //list all items
    public List<Items> findAll(){
      return this.itemsFacade.findAll();
    }
        
    
}
