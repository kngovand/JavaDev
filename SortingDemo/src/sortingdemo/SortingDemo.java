/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class SortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = {2, 3, 2, 5 ,8};
        sort(numbers);
        display(numbers);
        

        
        }
    
         public static void display(int[]list) {
        for(int i = 0; i<list.length;i++) {
            System.out.println(list[i]);
        }
            
    }
    
    
    
    

    public static void sort(int[] list) {
        for(int i = 0; i < list.length-1; i++) {
            int index = i;
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] < list[index]) {
                    index = j;
                }
            }
            
            int temp = list[index];
            list[index] = list[i];
            list[i] = temp;  
            
        }
    }
    

    
}//end main class
