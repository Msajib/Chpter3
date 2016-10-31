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
public class PE8 {
    PE8(){
        System.out.println("Enter Three Number:");
        int num1=Inp.nextInt();
        int num2=Inp.nextInt();
        int num3=Inp.nextInt();
        int num4=Inp.nextInt();
        
        

//        if (num1 <= num2 && num2 <= num3) {
//            System.out.println(num1 + " " + num2 + " " + num3);
//        }
//        if (num2 <= num1 && num1 <= num3) {
//            System.out.println(num2 + " " + num1 + " " + num3);
//        }
//        if (num3 <= num1 && num1 <= num2) {
//            System.out.println(num3 + " " + num1 + " " + num2);
//                  num1=21;num2=12;num3=30
//        }
            for(int i=0;i<3;i++){
               if(num1>num2){
                   int a=num2;
                   num2=num1;
                   num1=a;
               }
               if(num2>num3){
                   int a=num3;
                   num3=num2;
                   num2=a;
               }
               if (num3>num4){
                   int a=num4;
                   num4=num3;
                   num3=a;
                   
               }
               
            }
           
           
           System.out.println(num1+" "+num2+" "+" "+num3+" "+num4);

    }
    
}
