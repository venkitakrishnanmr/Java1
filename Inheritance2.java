package javaapplication1;

import java.util.Scanner;

class Employee
{
    private int eno;
    private String ename;
    Scanner sc=new Scanner(System.in);
    Employee()
    {
        System.out.println("enter employee number and employee name");
        eno=sc.nextInt();
        ename=sc.next();
    }
    void EmployeeMethod()
    {
         System.out.println("-------\nemployee no:"+eno+"\nemployee name:"+ename);
    }
}
class Permanent extends Employee
{
 
    private int sala,pt,netsal;
    Permanent()
            {
                System.out.println("enter salary");
               
                 sala=sc.nextInt();
              }
    void permanentMethod()
    {
        EmployeeMethod();
        if(sala>20000)
        {
            pt=sala*10/100;
            netsal=sala-pt;
            System.out.println("professional tax is:"+pt+"\nnet salary is:"+netsal);
        }
        else
             {
            pt=sala*5/100;
            netsal=sala-pt;
            System.out.println("professional tax is:"+pt+"\nnet salary is:"+netsal);
        }
            
    }
    
}
class Contract extends Employee
{
    private int renum;
     Contract()
    {
        System.out.println("enter renumeration");
        renum=sc.nextInt();
    }
     void ContractMethod()
     {
          EmployeeMethod(); 
          System.out.println("renumeration is:"+renum);
     }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Employee e=new Employee();
        Permanent p=new Permanent();
        Contract c=new Contract();
        e.EmployeeMethod();
        p.permanentMethod();
        c.ContractMethod();
    }
    
}
