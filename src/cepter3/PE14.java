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
public class PE14 {

    public PE14() {
        
//    int coin = (int)(Math.random() * 2+1);
//    
//    System.out.print("Do you think the coin will be heads or tail");
//    String guess = Inp.next();
//    if (guess != "heads" || guess !="tails")
//    System.out.println(" please enter a heads or tails");
//    System.out.print("Do you think the coin will be heads or tail");
//     if (guess == "heads"){
//      int guess = 1;
//     }
//     else if(guess == "tails"){
//         int guess = 0 ;
//     }
//     else
//         System.out.println(" please enter a heads or tails");
//     if (guess == coin)
//           System.out.println("Got it");
//    else if (coin == 0)
//      System.out.println("Sorry, it is a head");
//    else
//      System.out.println("Sorry, it is a tail");
//
System.out.println("Head Or Tail\nIf Head =1 or Tail=0");
        int a=(int) (Math.random()*2);
        
        int num=Inp.nextInt();
        System.out.println(a);
        
        if(num==a&&num==1){
            System.out.println("Head");
            
        }
        else
            System.out.println("Tail");
        
        
             }
        
    
    
    
}
