/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkeddemo;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class LinkedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node n = new Node("Hi", null);
        Node n2 = new Node ("hi2", n);
        
        System.out.println(n2.getNext().getData());
    }
    
    public static class Node {
        public String data;
        private Node next;
        
        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        public String getData() {
            return data;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setData(String d) {
            data = d;
        }
        public void setNext(Node n) {
            next = n;
        }
    } //End node

    
}
