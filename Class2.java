package javaapplication1;

import java.util.Scanner;

class Demo
{
    int eno;
       String mob,name,add;
       void get()
       {
         Scanner s=new Scanner(System.in);
          
         eno=s.nextInt();
         mob=s.next();
         name=s.next();
         add=s.next();
       }
       void set()
       {
           System.out.println(" eno:"+eno+"\t mobile number :"+mob+"\t name:"+name+"\t address :"+add);
       }
         
}
public class Class2 {
    public static void main(String[] args) {
        
    
    Demo d=new Demo();
    Demo d1=new Demo();
    Demo d2=new Demo();
    
    
   d.get();
   d1.get();
   d2.get();
   d.set();
   d1.set();
   d2.set(); 
    
}
}