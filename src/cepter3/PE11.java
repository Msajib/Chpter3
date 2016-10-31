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
public class PE11 {

    public PE11() {
        
        System.out.println("Enterr Month Number to know Day");
int month=Inp.nextInt();
        System.out.println("Enter Year ");
int a=Inp.nextInt();
         int b=28;
         if ((a%4==0&& a/100==0)||a%400==0){
             b+=1;
         }
        
            switch(month){
                case 1:
                    System.out.println("January 31");
                    break;
                case 2:
                    System.out.println("February "+b);
                    break;
                    case 3:
                    System.out.println("March 31");
                    break;
                    case 4:
                    System.out.println("April 30");
                    break;
                    case 5:
                    System.out.println("May 31");
                    break;
                    case 6:
                    System.out.println("June 30");
                    break;
                    case 7:
                    System.out.println("July 31");
                    break;
                    case 8:
                    System.out.println("Aguest 31");
                    break;
                    case 9:
                    System.out.println("Septembe 30");
                    break;
                    case 10:
                    System.out.println("October 31");
                    break;
                    case 11:
                    System.out.println("November 30");
                    break;
                    case 12:
                    System.out.println("December 31");
                    break;
                            
                    
                    
            }
            
    }
    
    
    
}
