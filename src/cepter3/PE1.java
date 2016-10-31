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
public class PE1 {

    public PE1() {
        System.out.println("Enter A B C");
        double a = Inp.nextDouble();
        double b = Inp.nextDouble();
        double c = Inp.nextDouble();
        double r1=0;
        double r2=0;
        double d = b * b - 4 * a* c;
        r1=(-b+Math.pow((b*b-4*a*c),0.5))/2*a;
        r2=(-b-Math.pow((b*b-4*a*c),0.5))/2*a;
        if(d>0){
        System.out.println("The root are: "+r1+" And "+r2);
        }
        else if (d==0){
            System.out.println("The Root is "+r1);
        }
        else
            System.out.println("The equation Has No Real Roots");
    }
    
    
}
