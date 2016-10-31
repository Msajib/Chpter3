/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepter3;

import static cepter3.Cepter3.Inp;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author sajib
 */
public class PE10 {

    public PE10() {
        int b=(int)(Math.random()*4% 10);
        int a=(int)(Math.random()*8 %10);
        int result=a-b;
        System.out.println(a+"-"+b+"= ?");
        int ans=Inp.nextInt();
        if(result==ans){
            System.out.println(a+"-"+b+" = "+ans+" Right Ans");
        }
        else
            System.out.println(a+"-"+b+" = "+ans+" Wrong Ans");
        
        
    }
    
    
}
