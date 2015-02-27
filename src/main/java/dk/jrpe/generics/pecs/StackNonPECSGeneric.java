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
 * @param <E>
 */
public class StackNonPECSGeneric<E> implements StackGeneric<E> {
    private E[] elements;
    private int size = 0;

    public int getSize() {
        return size;
    }
    private static final int DEAFULT_INITIAL_CAPACITY = 16;
    
    public StackNonPECSGeneric() {
        elements = (E[]) new Object[DEAFULT_INITIAL_CAPACITY];
    }
    
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    
    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }
    
    public E pop() {
        if(size == 0)
            throw new EmptyStackException();
        E result = (E)elements[--size];
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
