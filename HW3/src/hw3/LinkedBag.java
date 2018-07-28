/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.Objects;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class LinkedBag<T> implements NodeInterface<T> {

    private Node head;
    public int counter;
    
    public LinkedBag () {
        
        head = new Node(null);
        counter = 0;
    }
    
    
    public boolean add(T entry) {
        Node temp = new Node(entry);
        Node current = head;
        
        while(current.getNext() != null) {
            current = current.getNext();
        }
        
        current.setNext(temp);
        counter++;
        
        return true;
    }
    
    public T remove() {
        T result = null;
        if (head !=null) {
            result = head.data;
            head = head.next;
            counter-=1;
        }
        
        return result;
        
    }
    
    public String toString() {
        

        Node current = head.getNext();
        String output = "";
        while(current!=null) {
            output+= current.getData().toString();
            current = current.getNext();
                    System.out.println(output);
        }

        return output;
    }
    
        public T[] toArray() {
 
        T[] result = (T[]) new Object[counter];
        
            Node current = head;
            int index = 0;
            
            while ((index < counter) && current != null) {
                result[index] = current.data;
                index++;
                current = current.next;
            }    
                return result;
        }
    
    
    
    private class Node {
        
        private T data;
        private Node next;
        
        private Node(T dataPortion) {
            next = null;
            data = dataPortion;
        }

        private Node(T dataPortion, Node nextNode) {

            data = dataPortion;
            next = nextNode;
        }
        
        private T getData() {
            return data;
        }
        
        private void setData(T newData) {
            data = newData;
        }
        
        private Node getNext() {
            return next;
        }
        
        private void setNext(Node nextNode) {
            next = nextNode;
        }

    }

    @Override
    public int getCurrentSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    


