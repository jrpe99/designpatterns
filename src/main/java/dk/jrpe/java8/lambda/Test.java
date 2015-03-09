/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.jrpe.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jorperss
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        //Chart c = (list -> {return null;});
        

        Predicate<Integer> p2 = (p -> {return p > 1;});
        
        System.out.println(LambdaEnum.BIGGER_THEN_ZERO.test(-1));
        

    }
}
