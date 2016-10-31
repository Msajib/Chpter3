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
public class PE6 {
    PE6(){
        System.out.println("Enter Weight in Pounds:");
        double weight=Inp.nextDouble()*0.4535923;
        System.out.println("Enter Height In Inches:");
        double height=Inp.nextDouble()* 0.025;
        double bmi=weight/(height*height);
        System.out.printf("Your BMI is %5.2f\n", bmi);
         if (bmi < 16) 
         System.out.println("You are seriously underweight"); 
         else if (bmi < 18) 
                 System.out.println("You are underweight"); 
         else if (bmi < 24) 
                 System.out.println("You are normal weight");
         else if (bmi < 29) 
                 System.out.println("You are overweight");
         else if (bmi < 35) 
                 System.out.println("You are seriously overweigh ");
         else  
                 System.out.println("You are gravely overweight");

        
    }
    
    
}
