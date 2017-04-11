package javaapplication1;

import java.sql.Date;
import java.util.Scanner;

public class Date3 {
    public static void main(String[] args) {
        Date []d=new Date[3];
        String [] r=new String [3];
        String a;
        int tot=0;
        Date d7,d1;
        int [] s=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r.length;i++)
        {
            System.out.println("Enter The Date");
            r[i]=sc.next();
            d7=Date.valueOf(r[i]);
            d[i]=d7;   
            System.out.println("Enter The Value");
             s[i]=sc.nextInt();
        }
        System.out.println("Enter the Date for Compare");
        a=sc.next();
        d1=Date.valueOf(a);
        for(int i=0;i<r.length;i++)
        {
            if(d1.compareTo(d[i])==-1)
        {
            tot=tot+s[i];
        }
        }
        System.out.println(tot);
    }   
}
