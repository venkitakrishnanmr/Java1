package javaapplication1;
import java.util.Scanner;
class person
{
    private String name,gender;
    private int age;
    public void setName(String n)
    {
        name=n;
    }
    public void setGender(String g)
    {
        gender=g;
    }
    public void setAge(int a )
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public int  getAge()
    {
        return age;
    }
    void print()
    {
        System.out.println("nsme :"+getName()+"\ngender :"+getGender()+"\nAge :"+getAge());
    }
}
class Employe extends person
{
    private int ecode;
    private String designation;
    public void setEcode(int e)
    {
        ecode=e;
    }
    public void setDesignation(String d)
    {
        designation=d;
    }
    public int getEcode()
    {
        return ecode;
    }
    public String getDesignation()
    {
        return designation;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println("employee code :"+getEcode()+"designation :"+getDesignation());
    }
}
class permanent extends Employe
{
    private double salary,pt,netsalary;
    dependent [] d=new dependent[3];
    public void setSalary(double s)
    {
        salary=s;
    }
    public double getSalary()
            {
              return salary;  
            }
    public void calculate()
    {
        if(salary>50000)
        {
            pt=salary*0.1;
            netsalary=salary-pt;
        }
        else
        {
            pt=salary*0.5;
            netsalary=salary-pt;
        }
    }
    @Override
    public void print()
            {
                super.print();
                System.out.println("salray :"+salary+"\nprofessional tax :"+pt+"\n"
                        + ""
                        + "net salary"+netsalary); 
                for(int i=0;i<3;i++)
                {
                    d[i].print();
                }
            }
    
}
class dependent
{ 
    private String depid;
    private String depname;
    private String depage;
    private String deprel;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the Dependent Details");
        System.out.println("Enter the Dependent ID");
        depid=s.next();
        System.out.println("Enter the Dependent Name");
        depname=s.next();
        System.out.println("Enter the Dependent Relationship");
        deprel=s.next();
        System.out.println("Enter the Dependent Age");
        depage=s.next();     
    }
    void print()
    { 
        System.out.println("The Dependent Id is "+depid);
        System.out.println("The Dependent name is "+depname);
        System.out.println("The Dependent type is "+depage);
        System.out.println("The Dependent relative is "+deprel);
    }
}
public class RuntimePoly 
{
    public static void main(String[] args)  
    {  permanent p=new permanent();
       //person pe;
       //pe=p;//runtime polymorphism
       p.setName("priya");
       p.setAge(22);
       p.setGender("female");
       p.setEcode(1);
       p.setDesignation("tester");
       p.setSalary(60000);
       p.calculate();
       for(int i=0;i<3;i++)
       {   p.d[i]=new dependent();
           p.d[i].getdata();
       
       }
       p.print();
    }
    
}
