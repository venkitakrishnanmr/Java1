package javaapplication1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateEx {
    public static void main(String[] args) {
        String s="2017-01-10";
        Date d=Date.valueOf(s); 
        System.out.println(d);
       // Calendar c=Calendar.getInstance();
       // c.setTime(d);
       // c.add(Calendar.DATE,5);
       // System.out.println(c.getTime());
       Calendar c1=Calendar.getInstance();
       c1.setTime(d);
      // c1.add(Calendar.DATE,5);
        
       SimpleDateFormat s1=new SimpleDateFormat("dd/MMM/yyy");
       System.out.println(s1.format(d));
      //  System.out.println(s1.format(c1.getTime()));
       c1.add(Calendar.MONTH, 1);
       c1.add(Calendar.DATE,-10);
        System.out.println(c1 );
    }
    
}
