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
public class Question3 {
    
    public static void main(String[] args) {
        
        checkPal("taccat");
        checkPal("raccar");
        checkPal("beanbag");
        checkPal("Hannah");
        
    }   
    
    public static void checkPal(String a){ 
        
        String pal = a.toLowerCase();
        int first = 0;
        int last = pal.length()-1;

        boolean isPal = true;

        while (first <last)
        {
            String firstLetter = pal.substring(first,first+1);
            String lastLetter = pal.substring(last,last+1);

            if(firstLetter.equals(lastLetter)==false)
            {
                isPal=false;
                break;
            }
            first++;
            last--;
        }
        
        if(isPal==true)
        {
            System.out.println(a + " is a palindrone!");
        }

        else 
        {
            System.out.println(a + " is not a palindrone!");
        }
        // TODO code application logic here
    }}
    

    

