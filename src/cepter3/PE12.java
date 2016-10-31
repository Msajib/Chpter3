/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepter3;

import static cepter3.Cepter3.Inp;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author sajib
 */
public class PE12 {

    public PE12() {
        System.out.println("Enter A number");
        int a=Inp.nextInt();
        
        if(a%6==0&&a%5==0){
            System.out.println(a+" is divisible by both 5 and 6 ");
           
        }
        else if((a%5==0)||(a%6==0)){
            System.out.println(a+" is divisible by 5 or 6, but not both");
            
    }
        else 
            System.out.println("Is not divisible by either 5 or 6");
        
    }
    
    
}
