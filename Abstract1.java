package javaapplication1;

import java.util.Scanner;

abstract class EmployeeClass
{
    Scanner sc=new Scanner(System.in);
   protected int eno;
   protected  String ename;
   abstract void GetInput();
   abstract void calculate();
   abstract void print();
}
class PermanentClass extends EmployeeClass
{
    protected int basic;
    protected double pt;
    protected double netsel;
    void GetInput()
    {
        eno=sc.nextInt();
        ename=sc.next();
        basic=sc.nextInt();
        
    }
    void calculate()
    {
        if(basic>=20000)
        {
            pt=basic*0.1;
            netsel=basic-pt;
        }
        else if(basic>=10000&&basic<20000)
        {
         pt=basic*0.05;
         netsel=basic-pt;
        }    
    }
    void print()
    {
        System.out.println("The Employee Number "+eno);
        System.out.println("The Employee Name "+ename);
        System.out.println("The basic Salarty is "+basic);
        System.out.println("The Professional Tax is "+pt);
        System.out.println("The Net Salary is "+netsel);
    }
    
}
public class Abstract1 
{
    public static void main(String[] args) {
        PermanentClass P=new PermanentClass();
        P.GetInput();
        P.calculate();
        P.print();
    }
    
}
