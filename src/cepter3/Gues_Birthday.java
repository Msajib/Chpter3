/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepter3;

import javax.swing.JOptionPane;

/**
 *
 * @author sajib
 */
public class Gues_Birthday {

    public Gues_Birthday() {
         String set1 =  " 1  3  5  7\n" +  " 9 11 13 15\n" +  "17 19 21 23\n" +  "25 27 29 31";
          String set2 =  " 2  3  6  7\n" +  "10 11 14 15\n" +  "18 19 22 23\n" +  "26 27 30 31"; 
         String set3 =  " 4  5  6  7\n" +  "12 13 14 15\n" +  "20 21 22 23\n" +  "28 29 30 31"; 
          String set4 =  " 8  9 10 11\n" +  "12 13 14 15\n" +  "24 25 26 27\n" +  "28 29 30 31"; 
           String set5 = "16 17 18 19\n" +  "20 21 22 23\n" +  "24 25 26 27\n" +  "28 29 30 31"; 
        int answer=0;
           int day=0;
           answer=JOptionPane.showConfirmDialog(null, set1);
           if(answer==JOptionPane.YES_OPTION)
               day +=1;
           
               
        answer=JOptionPane.showConfirmDialog(null, set2);
        if(answer==JOptionPane.YES_OPTION)
               day +=2;
           
        answer=JOptionPane.showConfirmDialog(null, set3);
        if(answer==JOptionPane.YES_OPTION)
               day +=4;
           
        answer=JOptionPane.showConfirmDialog(null, set4);
        if(answer==JOptionPane.YES_OPTION)
               day +=8;
           
        answer=JOptionPane.showConfirmDialog(null, set5);
        if(answer==JOptionPane.YES_OPTION)
               day +=5;
           
        JOptionPane.showMessageDialog(null, day);
        
        
        
    } 
    
}
