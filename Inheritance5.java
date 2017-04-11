package javaapplication1;

import java.util.Scanner;

class Employee1
{
    private int eno,age;
    private String ename,phone;
    Scanner sc=new Scanner(System.in);
     Employee1(int eno,int age,String ename,String phone)
    {
     this.eno=eno;
     this.age=age;
     this.ename=ename;
     this.phone=phone;
    }
   
    void print()
    {
        System.out.println("employee number :"+eno+"\nage :"+age+"\nemployee name :"+ename+"\nphone:"+phone); 
    }
}
class Permanent1 extends Employee1
{
    private int basic;
     private double pt,netsal; 
Permanent1(int eno,String ename,int age,String phone,int basic )
{
    super(eno,age,ename,phone);
    this.basic=basic;
    
    
}
void Calculate()
{
    if(basic>20000)
    {
        pt=basic*0.2;
        netsal=basic-pt;
    }
    else
         {
        pt=basic*0.1;
        netsal=basic-pt;
    }
}
void print()
{
    super.print();
    System.out.println("basic salary :"+basic+"\nprofessional tax :"+pt+"\nnet salary :"+netsal);
}
}
class Contract1 extends Employee1
{
    
    private int renum;
    Contract1(int eno,String ename,int age,String phone,int renum)
    {
        super(eno,age,ename,phone);
        this.renum=renum;
    }
    void print()
    {
        super.print();
        System.out.println("renumeration :"+renum);
    }
}

public class Inheritance5 {
    public static void main(String[] args)
    {
        int eno,age,basic,pt,netsal,renum;
        String ename,phone;
        Scanner sc=new Scanner(System.in);
        System.out.println("entr employee number");
        eno=sc.nextInt();
        System.out.println("enter employee name");
        ename=sc.next();
        System.out.println("enter phone");
        phone=sc.next();
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter basic slary");
        basic=sc.nextInt();
        System.out.println("enter enumeration");
        renum=sc.nextInt();
        Permanent1 p1=new Permanent1(eno,ename,age,phone,basic );
        Contract1 c1=new Contract1(eno,ename,age,phone,renum);
        p1.Calculate();
        p1.print();
        c1.print();
        
    }
}
