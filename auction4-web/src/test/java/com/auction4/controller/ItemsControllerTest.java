/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction4.controller;

import com.auction4.entities.Items;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yvonneak
 */
public class ItemsControllerTest {
    
    public ItemsControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getI method, of class ItemsController.
     */
    @Test
    public void testGetI() {
        System.out.println("getI");
        ItemsController instance = new ItemsController();
        Items expResult = null;
        Items result = instance.getI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setI method, of class ItemsController.
     */
    @Test
    public void testSetI() {
        System.out.println("setI");
        Items i = null;
        ItemsController instance = new ItemsController();
        instance.setI(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ItemsController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ItemsController instance = new ItemsController();
        List<Items> expResult = null;
        List<Items> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
