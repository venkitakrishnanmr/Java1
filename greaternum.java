/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Trg
 */
public class greaternum {
    public static void main(String[] args) {
        
       
        Scanner no1=new Scanner(System.in);
        int num1,num2,num3;
        num1=no1.nextInt();
        num2=no1.nextInt();
        num3=no1.nextInt();
        if(num1>num2 && num1>num3){
          System.out.println(num1+" is greater");
        }
                    
        
         else if(num2>num3)
         {
                    
          
              System.out.println(num2+"is greater");
        }
          else
          {
                            System.out.println(num3+"is greater");
              
              }
        }
        
        
        
        
    }
    
   

