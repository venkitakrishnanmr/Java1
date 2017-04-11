package javaapplication1;

import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
       int i,j,c=0,sum=0,k;
        int a[]=new int[5];
       int n[]=new int[5];
       Scanner sc=new Scanner(System.in);
       for(i=0;i<n.length;i++)
           n[i]=sc.nextInt();
        System.out.println("all prime numbers are");
       for(i=0;i<n.length;i++){
                 
         
         c=0;
       for(j=1;j<=n[i];j++)
       {
           if(n[i]%j==0)
               c++;
       }
      
      
       if(c==2)
       {
           
           System.out.println(n[i]); 
    }
       else
       {
           a[i]=a[i]+10;
           System.out.println(a[i]);
       }
         }
                    
               
     
       
         System.out.println("total of prime number is"+sum);
                  
        
    }
}
