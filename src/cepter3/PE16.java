/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepter3;

import static cepter3.Cepter3.Inp;

/**
 *
 * @author sajib
 */
public class PE16 {

    public PE16() {
        
 
//        System.out.println("How many random uppercase letters (up to 10) would you like to enter?");
//        int choice = Inp.nextInt();
 
        char randomChar =
(char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        System.out.println(randomChar);
            
             
        

    }
    
    
}
