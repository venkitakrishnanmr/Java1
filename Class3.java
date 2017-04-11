package javaapplication1;

import java.util.Scanner;

class Stu
{
    int sno,m1,m2,m3;
    String sname;
    void accept()
    {
         Scanner s=new Scanner(System.in);
          
         sno=s.nextInt();
         m1=s.nextInt();
         m2=s.nextInt();
         m3=s.nextInt();
         sname=s.next();
    }
    void total(){
        
        //System.out.println("total is"+(m1+m2+m3));
        System.out.println("total:"+(m1+m2+m3)+"out of 100");
       }
    void display()
    {
         System.out.println(" student number:"+sno+"\t student name :"+sname+"\t maths :"+m1+"\t physics:"+m2+"\t hindi :"+m3);
         total();
    }
    

}
public class Class3 {
    public static void main(String[] args) {
        Stu s=new Stu();
        Stu s1=new Stu();
        s.accept();
       s1.accept();
        //s.total();
       // s1.total();
       s.display();
       s1.display();
    }
       
    
}
