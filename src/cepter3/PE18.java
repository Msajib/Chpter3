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
public class PE18 {

    public PE18() {
        int a=Inp.nextInt();
         int b;
         if ((a%4==0&& a/100==0)||a%400==0){
             System.out.println("LeapYear");
         }
         else
             System.out.println("No");
         
    }
    
    
}
