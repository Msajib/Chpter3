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
public class PE5 {

    public PE5() {
        System.out.println("Enter Unsorted 3 number ");
        int a=Inp.nextInt();
        int b=Inp.nextInt();
        int c=Inp.nextInt();
        if ((a > b && a > c))
        {
            if(b > c)
            {
                System.out.print(c + " " + b + " " + a);
            }
            else
                System.out.print(b + " " + c + " " + a);
        }
        else if ((b > a && b > c))
        {
            if(a > c)
            {
                System.out.print(c + " " + a + " " + a);
            }
            else
                {
                System.out.print(a + " " + c + " " + b);
                }
        }
        else if ((c > a && c > b))
        {
            if(a > b)
            {
                System.out.print(b + " " + a + " " + c);
            }
            else
                System.out.print(a + " " + b + " " + c);
        }
        else
        {
            System.out.println("ERROR!");
        }
    }
}
