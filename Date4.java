package javaapplication1;

import java.sql.Date;
import java.util.Scanner;

public class Date4 
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   Date  d[]=new Date[3];
   int n[]=new int[3];
   String cdt;
   String d1;
   Date cdt1;
   int sum=0;
        System.out.println(" enter 3 dates in yy-mm-dd");
   for(int i=0;i<d.length;i++)
{    d1=sc.next();
    d[i]=Date.valueOf(d1);
}
        System.out.println("enter 3 integer");
   for(int j=0;j<n.length;j++)
   {
       n[j]=sc.nextInt();
   }
        System.out.println("enter any date in yy-mm-dd");
   cdt=sc.next();
   cdt1=Date.valueOf(cdt);
   for(int i=0;i<d.length;i++)
   {
       if(cdt1.compareTo(d[i])==-1)
           sum=sum+n[i];
   }
        System.out.println("sum of integer "+sum);
}
}
