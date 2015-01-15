/*
 * In eager initialization, the instance of Singleton Class is created at the 
 * time of class loading, this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it. * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.jrpe.designpatterns.singleton;

public class EagerInitializedSingleton {
     
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
     
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
 
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
