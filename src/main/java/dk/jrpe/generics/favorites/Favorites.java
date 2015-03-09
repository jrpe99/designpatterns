/*
 * Effective Java - Item 29
 */
package dk.jrpe.generics.favorites;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jorperss
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();
    
    public <T> void put(Class<T> type, T instance) {
        if(type == null)
            throw new NullPointerException("Type is null");
        favorites.put(type, type.cast(instance));
    }
    
    public <T> T get(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
