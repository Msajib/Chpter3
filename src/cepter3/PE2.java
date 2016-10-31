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
public class PE2 {
    PE2(){
         System.out.println("Enter A number to Check EVEN OR ODD");
         int num=Inp.nextInt();
         boolean a=num%2==0;
         if (a) {
             System.out.println("Is "+num+" An even Number? "+a);
             
         }
         else
             System.out.println("Is"+num+"an even Number? "+a);
    }
    
}
