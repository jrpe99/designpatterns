/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.jrpe.java8.lambda;

import java.util.function.Predicate;

/**
 *
 * @author jorperss
 */
public enum LambdaEnum {
    BIGGER_THEN_ZERO((p -> {return p > 0;})),
    EQUAL_TO_ZERO((p -> {return p == 0;})),
    SMALLER_THEN_ZERO((p -> {return p < 0;}));
    
    private Predicate<Integer> p;
    
    LambdaEnum(Predicate<Integer> p) {
        this.p = p;
    }
    
    public boolean test(Integer i) {
        return p.test(i);
    }
}
