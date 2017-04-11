
package javaapplication1;

import static java.time.Clock.system;
import java.util.Scanner;


public class Evan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,sum=0,odd=0;
        int a[]=new int[5];
            System.out.println("entr values in array :");
        for(i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
           
        }
       // System.out.println("all even numbers :");
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {    
               // System.out.println(" "+a[i]);
            sum=sum+a[i];
                
            
            }
            
            else 
            {
                //System.out.println(+a[i]);

                odd=odd+a[i];
            }
               
          
            
        }System.out.println("sum of all even number is :"+sum);
        System.out.println("sum of all odd number is :"+odd);
        
    }
    
}
