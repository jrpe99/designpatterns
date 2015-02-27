/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.jrpe.generics.pecs;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author jorperss
 */
public class StackNonGeneric {
    private Object[] elements;
    private int size = 0;
    private static final int DEAFULT_INITIAL_CAPACITY = 16;
    
    public StackNonGeneric() {
        elements = new Object[DEAFULT_INITIAL_CAPACITY];
    }
    
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    
    public Object pop() {
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    private void ensureCapacity() {
        if(elements.length == size) 
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
