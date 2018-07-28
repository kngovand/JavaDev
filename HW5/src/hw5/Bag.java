/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import hw5.BagInterface;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */

public class Bag<T extends Comparable<T>> implements BagInterface<T> {
    
    private T[] bag;
    private static int numbOfEntries;
    private static int DEFAULT_CAPACITY = 10;
    private static final int MAX_CAPACITY = 10000;
    
    public Bag() {
        Comparable[] bagObj = new Comparable[DEFAULT_CAPACITY];
        
        bag = (T[]) bagObj;
        numbOfEntries = 0;         
    }

    public Bag(int size) {
        
        if(size < MAX_CAPACITY) {
            Comparable[] bagObj = new Comparable[size];

            bag = (T[]) bagObj;
            numbOfEntries = 0;
        }
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
        Comparable[] newBagObject = new Comparable[numbOfEntries];
        T[] newBag = (T[]) newBagObject;
        
        for (int i = 0; i < numbOfEntries; i++)
        {
            newBag[i] = bag[i];
        }
        
        return newBag;
        
    }

    public void quickSort(Comparator comp) {
        quickSort(comp, 0, numbOfEntries-1);
    }
    
    
    public void quickSort(Comparator comp, int first, int last) {
       
        if(first < last) {
            int pivot = partition(comp, first, last);
            quickSort(comp, first, pivot-1);
            quickSort(comp, pivot+1, last);
        }
    }
    
    public int partition(Comparator comp, int first, int last) {
        int pivot = last;
        boolean done = false;
        
        int leftIndex = first;
        int rightIndex = last - 1;
        
        while (!done) {
            while ((leftIndex <= rightIndex) && (comp.compare(bag[leftIndex], bag[pivot]) < 0)) {
                leftIndex++;
            }
            while ((leftIndex <= rightIndex) && (comp.compare(bag[rightIndex], bag[pivot]) >= 0)) {
                rightIndex--;
            }
            
            if(leftIndex < rightIndex) {
                T temp = bag[leftIndex];
                bag[leftIndex] = bag[rightIndex];
                bag[rightIndex] = temp;
            }
            else {
                done = true;
            }
        }
        
        T temp = bag[leftIndex];
        bag[leftIndex] = bag[pivot];
        bag[pivot] = temp;
        
        return pivot;
    }

    public void selectionSort() {
        for(int i = 0; i < numbOfEntries; i++) {
        int index = i; 
        
            for(int j = i + 1; j < numbOfEntries; j++) {
                if(bag[j].compareTo(bag[index]) < 0) {
                    index = j;
                }
            } 
        T temp = bag[index];
        bag[index] = bag[i];
        bag[i] = temp;  
        }
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


