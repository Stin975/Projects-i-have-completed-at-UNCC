/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version 1.0
 * @author Austin Hill
 */
public class ArrayListStackTest {

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object t = 1;
        ArrayListStack instance = new ArrayListStack();
        instance.push(t);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.size(), 1);
        instance.push(t);
        assertEquals(instance.size(), 2);
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = 1;
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        try {
            result = instance.pop();
        } catch (EmptyCollectionException e) {
            assertTrue(e instanceof EmptyCollectionException);
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = 1;
        instance.push(expResult);
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        try {
            instance.pop();
            result = instance.peek();
        } catch (EmptyCollectionException e) {
            assertTrue(e instanceof EmptyCollectionException);
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance.push(1);
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance.push(1);
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);
    }
    
}
