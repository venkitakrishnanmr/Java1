package javaapplication1;

import java.util.Scanner;

interface IEmployee2
{
    void Accept();
    void Calculate();
    void print();   
}
interface IProject
{
    void Acceptproject();
    void printproject();
}
class Employee3 implements IProject,IEmployee2
{ 
    private int empid,projectid;
    private String ename,pname;
    private double salary,netsal,pt;
    Scanner sc=new Scanner(System.in);
    public void Accept()
    {
        System.out.println("Enter the Employee Id");
        empid=sc.nextInt();
        System.out.println("Enter the Employee Name");
        ename=sc.next();
        System.out.println("Enter the Employee Salary");
        salary=sc.nextDouble();
    }
    public void Calculate()
    {
        if(salary>=20000)
        {
            pt=salary*10/100;
            netsal=salary-pt;
        }
        else
        {
         pt=salary*5/100;
         netsal=netsal-pt;
        }
    }
    public void print()
    {
        System.out.println("The Employee Id is "+empid);
        System.out.println("The Employee Name is "+ename);
        System.out.println("The Employee Salary is "+salary);
        System.out.println("The Employee Profession Tax is "+pt);
        System.out.println("The Employee Net Salary is "+netsal);
    }
    public void Acceptproject()
    {
        System.out.println("Enter The project Id");
        projectid=sc.nextInt();
        System.out.println("Enter the project Name");
        pname=sc.next();
    }
    public void printproject()
    {
        print();
        System.out.println("The Employee is working in the project ID "+projectid);
        System.out.println("The Employee is working under this project Name " +pname);
    }
}
public class EmployeeInterface {
    public static void main(String[] args) {
        Employee3 E=new Employee3();
      E.Accept();
      E.Calculate();
      E.Acceptproject();
      E.printproject();
    }
}
