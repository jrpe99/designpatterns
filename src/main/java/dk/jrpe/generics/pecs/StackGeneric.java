/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.jrpe.generics.pecs;

/**
 *
 * @author jorperss
 */
public interface StackGeneric<E> {
    public void push(E e);
    public E pop();
    public boolean isEmpty();
    public int getSize();
}
