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
public class PE19 {

    public PE19() {
        double num1=Inp.nextDouble();
        double num2=Inp.nextDouble();
        double num3=Inp.nextDouble();
        if (num1+num3>num2){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
    
    
}
