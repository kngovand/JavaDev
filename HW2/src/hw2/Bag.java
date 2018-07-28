/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.Objects;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Bag<T> implements BagInterface<T> {
    
    private T[] bag;
    private int numbOfEntries;
    private static int DEFAULT_CAPACITY = 10;
    
    public Bag() {
        Object bagObj = new Object[DEFAULT_CAPACITY];
        
        bag = (T[]) bagObj;
        numbOfEntries = 0;
                
    }

    public Bag(int size) {
        
        Object bagObj = new Object[size];
        
        bag = (T[]) bagObj;
        numbOfEntries = 0;
    }
    
    public int getCurrentSize() {
        return numbOfEntries;
    }
    
    public boolean isEmpty() {
        return (numbOfEntries == 0);
    }
    
    public boolean add(T newEntry) {
        
        if (isArrayFull()) {
            bag[numbOfEntries] = newEntry;
            numbOfEntries++;
            return true;   
        }
        
        return false;
    }
    
    public T remove() {
        numbOfEntries--;
        T temp = bag[numbOfEntries];
        bag[numbOfEntries] = null;
        
        return temp;
    }
    
    private boolean isArrayFull () {
        
        
        return (numbOfEntries < bag.length);
            
    }
    
    public boolean remove(T anEntry) {
        int index = findItem (anEntry);
        boolean result = false;
        
        if (index!= -1) {
            numbOfEntries--;
            bag[index] = bag[numbOfEntries];
            bag[numbOfEntries] = null;
            result = true;
        }
        
        return result;
    }
    
    public int findItem(T anEntry) {
        int index = -1;
        boolean found = false;
        int i = 0;
        
        while (!found && i< numbOfEntries) {
            if(anEntry.equals(bag[i])) {
                index = i;
                found = true;
            }
            
            i++;
                
        }
        
        return index;
    }
    
    
    public T[] toArray() {
        Object newBagObject = new Object[numbOfEntries];
        T[] newBag = (T[]) newBagObject;
        
        for (int i = 0; i < numbOfEntries; i++)
        {
            newBag[i] = bag[i];
        }
        
        return newBag;
        
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

