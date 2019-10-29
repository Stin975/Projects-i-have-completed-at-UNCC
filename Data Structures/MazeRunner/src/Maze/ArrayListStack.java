/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author Austin Hill
 * @param <T> Generic class
 */
public class ArrayListStack<T> implements StackADT<T> {

    private ArrayList<T> al = new ArrayList<T>();
    
    
    /**
     * Adds an T to the ArrayList using a stack method.
     * 
     * @param t Generic parameter
     */
    @Override
    public void push(T t) {
        al.add(t);
    }

    /**
     * removes an T from the end of the ArrayList using a stack method and
     * sends that T back.
     * 
     * @return T 
     * @throws DataStructures.EmptyCollectionException 
     */
    @Override
    public T pop() throws EmptyCollectionException {
        T temp;
        if (!isEmpty()) {
            temp = al.get(al.size() - 1);
            al.remove(al.size() - 1);
        } else {
            throw new EmptyCollectionException("Empty stack");
        }
        return temp;
    }

    /**
     * return an Generic object from the end of the ArrayList using a stack method.
     * 
     * @return T  
     * @throws DataStructures.EmptyCollectionException  
     */
    @Override
    public T peek() throws EmptyCollectionException {
        T temp;
        if (!isEmpty()) {
            temp = al.get(al.size() - 1);
        } else {
            throw new EmptyCollectionException("Empty stack");
        }
        return temp;
    }

    /**
     * Checks to see if the ArrayList is empty and returns true or false.
     * 
     * @return boolean 
     */
    @Override
    public boolean isEmpty() {
        return al.isEmpty();
    }

    /**
     * returns the size of the ArrayList.
     * 
     * @return Integer 
     */
    @Override
    public int size() {
        return al.size();
    }
    
}
