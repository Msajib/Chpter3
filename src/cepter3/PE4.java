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
public class PE4 {

    public PE4() {
        
        int n1=(int)(System.currentTimeMillis()%10);
        int n2=(int)(System.currentTimeMillis()*7 % 10);
        System.out.println(n1+" + "+n2+" = ");
        int ans=Inp.nextInt();
        int result=n1+n2;
        System.out.println(n1+" + "+n2+" = "+ans+" Is "+(n1+n2==ans));
    }
    
    
}
