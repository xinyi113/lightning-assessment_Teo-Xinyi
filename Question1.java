/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digi.x;

/**
 *
 * @author Teo Xinyi
 */


public class Question1 {
  
// Write a for loop that prints all the multiples of 3 and 5 up to 100.    
    public static void main(String[] args) {    
    
        
        for(int i=3;i<=100;i++){
            if ( i%3==0 || i%5==0 ){
                System.out.print(i+" ");
            }
        }
    
    }
}
