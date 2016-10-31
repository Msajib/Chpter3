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
public class PE3 {
    PE3(){
         System.out.println("Enter a, b, c, d, e, f: ");
          double a=Inp.nextDouble();
          double b=Inp.nextDouble();
          double c=Inp.nextDouble();
          double d=Inp.nextDouble();
          double e=Inp.nextDouble();
          double f=Inp.nextDouble();
          double r=(a*d-b*c);
          double x=(e*d-b*f)/r;
          double y=(a*f-e*c)/r;
          if(r==0){
              System.out.println("The Equation Has No Solution");
          }
          else
              System.out.println("X is "+x+" And Y Is "+y);
          
    }
    
}
