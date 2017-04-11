package javaapplication1;

import java.util.Scanner;

public class prime2 {public static void main(String[] args) {
       int i,min,c=0,j;
       Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
       
        for(i=0;i<a.length;i++)
          a[i]=sc.nextInt();
       for(i=0;i<a.length;i++)
       {
           for(j=i;j<a.length;j++)
           {
           if(a[j]%(j+1)==0)
                   System.out.println(a[i]);
               
       }
    
} 
}
}
