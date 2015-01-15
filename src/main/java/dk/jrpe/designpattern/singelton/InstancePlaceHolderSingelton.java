/*
 * See 
 * - Effective Java Second Edition s71
 * - http://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 */
package dk.jrpe.designpattern.singelton;

public class InstancePlaceHolderSingelton {
    private static class InstanceHolder {
        static final InstancePlaceHolderSingelton INSTANCE = new InstancePlaceHolderSingelton();
    }
    
    public InstancePlaceHolderSingelton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
