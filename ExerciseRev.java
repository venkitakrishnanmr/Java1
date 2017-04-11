package javaapplication1;

import java.util.Scanner;


public class ExerciseRev {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter number between 2 to 6 ditig ");
        
        int sum=0,n,rem;
        int num1=num.nextInt();
       if(num1>9 && num1<=999999)
       {

           while(num1>0)
        {
            
        //n=num1/10;
        rem=num1%10;
         num1=num1/10;
        sum=(sum*10)+rem;
        
        }
        System.out.println(sum);

       }
       else{
           System.out.println("number should be betwwen two and six digit");
       }
        }
          
    }

    
   

