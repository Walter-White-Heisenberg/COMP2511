/**
 *
 */
package unsw.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * An implementation of Set that uses an ArrayList to store the elements.
 *
 * @invariant All e in elements occur only once
 *
 * @author Robert Clifton-Everest
 *
 */
public class ArrayListSet<E> implements Set<E> {

    private ArrayList<E> elements;

    public ArrayListSet() {
        elements = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        if (!elements.contains(e))
            elements.add(e);
    }

    @Override
    public void remove(E e) {
        elements.remove(e);
    }

    @Override
    public boolean contains(Object e) {
        return elements.contains(e);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean subsetOf(Set<?> other) {
    	// other contains all the elements in "elements"
        // 1. other's size needs to be >= element's size
    	if (other.size() < elements.size()) {
    		return false;
    	} else if (other.size() >= elements.size()) {
		
			for (E small : elements) {
				if (!other.contains(small)) {
					return false;
				}
			}
    		
    	}
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Implement me
        return elements.iterator();
    }

    @Override
    public Set<E> union(Set<? extends E> other) {
        Set<E> newList = new ArrayListSet<>();
        for (E obj : other) {
        	if (!newList.contains(obj)) {
        		newList.add(obj);
        	}
        }
        for (E e : elements) {
        	if (!newList.contains(e)) {
        		newList.add(e);
        	}	
        }
        return newList;
    }

    @Override
    public Set<E> intersection(Set<? extends E> other) {
        // TODO Implement me
    	Set<E> newList = new ArrayListSet<>();
    	if (other.size() >= elements.size()) {
			for (E e : elements) {
				if (other.contains(e)) {
					newList.add(e);
				}
			}
    	} else {
    		for (E o : other) {
    			if (elements.contains(o)) {
    				newList.add(o);
    			}
    		}
    	}
        return newList;
    }

    /**
     * For this method, it should be possible to compare all other possible sets
     * for equality with this set. For example, if an ArrayListSet<Fruit> and a
     * LinkedListSet<Fruit> both contain the same elements they are equal.
     * Similarly, if a Set<Apple> contains the same elements as a Set<Fruit>
     * they are also equal.
     */
    @Override
    public boolean equals(Object other) {
    	// basic check
    	if (this == other) {
    		return true;
    	}
    	if (other == null) {
    		return false;
    	}
    	if (!(other instanceof Set<?>)) {
    		return false;
    	}
    	// object check
    	Set<?> eg = (Set<?>) other;
    	if (this.size() != eg.size()) {
    		return false;
    	}
    	Iterator<?> egIterator = eg.iterator();
    	while(egIterator.hasNext()) {
    		if (!contains(egIterator.next())) {
    			return false;
    		}
    	}
    	return true;
    }

}
