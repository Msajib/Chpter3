/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepter3;

import static cepter3.Cepter3.Inp;
import javax.swing.JOptionPane;

/**
 *
 * @author sajib
 */
public class PE9 {
    PE9(){
       
       String d1=JOptionPane.showInputDialog(null,"Enter 1st number");
       String d2=JOptionPane.showInputDialog(null,"Enter 2nd number");
       String d3=JOptionPane.showInputDialog(null,"Enter 3rd number");
       String d4=JOptionPane.showInputDialog(null,"Enter 4th number");
       String d5=JOptionPane.showInputDialog(null,"Enter 5th number");
       String d6=JOptionPane.showInputDialog(null,"Enter 6th number");
       String d7=JOptionPane.showInputDialog(null,"Enter 7th number");
       String d8=JOptionPane.showInputDialog(null,"Enter 8th number");
       String d9=JOptionPane.showInputDialog(null,"Enter 9th number");
       
       int a1=Integer.parseInt(d1);
       int a2=Integer.parseInt(d2);
       int a3=Integer.parseInt(d3);
       int a4=Integer.parseInt(d4);
       int a5=Integer.parseInt(d5);
       int a6=Integer.parseInt(d6);
       int a7=Integer.parseInt(d7);
       int a8=Integer.parseInt(d8);
       int a9=Integer.parseInt(d9);
       int a10=((a1*1)+(a2*2)+(a3*3)+(a4*4)+(a5*5)+(a6*6)+(a7*7)+(a8*8)+(a9*9))%11;
        JOptionPane.showMessageDialog(null, a10);
    }
    
}
