package javaapplication1;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Date2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        Date d=Date.valueOf(s);
           Calendar c=Calendar.getInstance();
           c.setTime(d);
           if(c.get(Calendar.DATE)==1)
       {
           
           c.add(Calendar.DATE, -1);
           System.out.println(c.getTime());
       }
        else
       {
           c.add(Calendar.MONTH,1);
           c.set(Calendar.DATE, 1);
           c.add(Calendar.DATE,-1);
           System.out.println(c.getTime());
            }

    }
    
}
