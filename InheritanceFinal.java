package javaapplication1;

import java.util.Scanner;

class Person
{
    private String name,phone;
    private int age;
    Scanner sc=new Scanner(System.in);
    Person()
    {
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter phone");
        phone=sc.next();
    }
    void print()
    {
        System.out.println("name :"+name+"\nage :"+age+"\nphone :"+phone);
    }
    
}
class Teacher extends Person
{
    private int empcode,experience,basic;
    private double pt,netsal;
    private String subject;
    Teacher()
    {
        System.out.println("enter employee code");
        empcode=sc.nextInt();
        System.out.println("enter subject");
        subject=sc.next();
        System.out.println("enter experience");
        experience=sc.nextInt();
        System.out.println("enter basic slary");
        basic=sc.nextInt();
        
    }
    void calculate()
    {
        if(basic>20000)
        {
            pt=basic*0.10;
            netsal=basic-pt;
        }
        else
        {
            pt=basic*0.05;
            netsal=basic-pt;
        
        }
    }
        void print()
        {
            super.print();
            System.out.println("employee code :"+empcode+"\nsubject :"+subject+"\nexperience :"+experience+"\nBasic salary :"+basic+"\nprofessional tax :"+pt+"\nNet salary"+netsal);
        }
    }
class Student1 extends Person
{
    private int stno,feespaid;
    private double avg,m1,m2,m3,tot;
    private String res,course;
    Student1()
    {
        System.out.println("enter student number");
        stno=sc.nextInt();
        
        System.out.println("enter course");
        course=sc.next();
        System.out.println("eneter paid fees");
        feespaid=sc.nextInt();
        System.out.println("enter marks1,marks2,marks3");
        m1=sc.nextDouble();
        m2=sc.nextDouble();
        m3=sc.nextDouble();
        
    }
    void calculate()
    {
        tot=m1+m2+m3;
        avg=tot/3;
        if(m1>=50&&m2>=50&&m3>=50)
        {
             if(avg>90)
                res="A+";
             else if(avg>80)
                 res="A";
             else if(avg>70)
                 res="B";
             else if(avg>60)
                 res="C";
             else 
                 res="D";
        }
        else
            res="fail";
        
    
    }
    void print()
    {
        super.print();
        System.out.println("Student number :"+stno+"\nCourse :"+course+"\nPaid feed :"+feespaid+"\njava :"+m1+"\nTesting :"+m2+"\nAutomation"+m3+"\nTotal :"+tot+"\nAverage :"+avg+"\nResult :"+res);
    }
}
public class InheritanceFinal {
    public static void main(String[] args) {
        
    
    char a;
    System.out.println("enter input for student and teacher");
    Scanner sc=new Scanner(System.in);
    a=sc.next().charAt(0);
        if(a=='s'||a=='S')
    {
        
        Student1 s=new Student1();
        s.calculate();  
        s.print();
    }
    if(a=='t' || a=='T')
    {
        Teacher t=new Teacher();
        t.calculate();
        t.print();
        
    }
    
    
}
}
