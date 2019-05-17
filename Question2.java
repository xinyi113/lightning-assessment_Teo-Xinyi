/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digi.x;

import java.util.Arrays;
/**
 *
 * @author Teo Xinyi
 */
public class Question2 {
    
    public static void main(String[] args) {
        
        int num[]={100,2,5,13,29,68,87,4,17,45,54};
        Arrays.sort(num);
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
        
    }
        
}
