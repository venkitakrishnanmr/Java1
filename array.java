
package javaapplication1;

import java.util.Scanner;


public class array {
    public static void main(String[] args) {
       int i,min,c=0;
       Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
       for(i=0;i<a.length;i++)
          a[i]=sc.nextInt();
          min=a[1];
       for(i=0;i<a.length;i++){
           if(a[i]<=min)
               min=a[i];
                    
       }
        System.out.println("min value is"+min);
           
            

        //System.out.println("length="+a.length);
               
    }
   
}
