/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wadeowen
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
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
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object ele = null;
        VectorHeap instance = new VectorHeap();
        instance.add((Comparable) ele);
        if(instance.remove() != ele)
            fail("The test case is a prototype.");
    }

    /**
     * Test of addRec method, of class VectorHeap.
     */
    @Test
    public void testAddRec() {
        System.out.println("addRec");
        VectorHeap instance = new VectorHeap();
        Node expResult = null;
        Object ele = null;
        Node result = instance.addRec((Comparable) ele, null);
        if(result == null)
            fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.remove();
        if(result != null)
            fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 0;
        int result = instance.size();
        if(result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
        instance.clear();
    }
    
}
