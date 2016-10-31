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
public class PE15 {

    public PE15() {
        int lottery=(int)(Math.random()*1000);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess=Inp.nextInt();
        int lotaryDigit1=lottery/10;
        int lotaryDigit2=lottery/10;
        int guess1=guess/10;
        int guess2=guess%10;
        System.out.println("The lottery number is " + lottery); 
        if(guess==lottery)
            System.out.println("Exact match: you win $10,000");
        else if(guess2==lotaryDigit1 && guess1==lotaryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if(guess1==lotaryDigit1||
                guess1==lotaryDigit2||
                guess2==lotaryDigit1||
                guess2==lotaryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry,No Match!");
        
    }
    
    
}
