/*
 * PECS - Producer extands, Consumer super
 */
package dk.jrpe.generics.pecs;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jorperss
 */
public class Pecs {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(new Integer("1"));
        Set<Number> s2 = new HashSet<>();
        s2.add(new Long("2"));
        
//        for(Number n: unionNonFlex(s1, s2)) // Will not compile
//            System.out.println(n);
        print(unionFlex1(s1, s2));
        
        print(unionFlex2(s1, s2));

    }
    
    // Flexible method - any class extending element E
    public static <E> Set<E> unionFlex1(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> unionS = new HashSet<>(s1);
        unionS.addAll(s2);
        return unionS;
    }
    
    // more flexible method - any class extending Number
    public static Set<Number> unionFlex2(Set<? extends Number> s1, Set<? extends Number> s2) {
        Set<Number> unionS = new HashSet<>(s1);
        unionS.addAll(s2);
        return unionS;
    }

    // Non flexible method - only handles Number
    public Set<Number> unionNonFlex(Set<Number> s1, Set<Number> s2) {
        Set<Number> unionS = new HashSet<>(s1);
        unionS.addAll(s2);
        return unionS;
    }

    public static <E> void print(Set<E> s) {
        for(E e: s) {
            System.out.println(e);
        }
    }


}
