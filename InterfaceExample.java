
import java.sql.Date;
import java.util.Scanner;

interface Icalculate
{
   public void calculateIncreament();
}
abstract class Employee implements Icalculate
{
    Scanner sc=new Scanner(System.in);
    private int id;
    private String name,gender,city,doj1;
    private Date doj;
   public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
   public void SetGender(String gender)
    {
        this.gender=gender;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
   public void setDoj(Date doj)
    {
        this.doj=doj;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
   public String getGender()
    {
        return gender;
    }
   public String getCity()
    {
        return city;
    }
    public Date getDoj()
    {
        return doj;
    }
  public  void accept()
    {
        this.id=sc.nextInt();
        this.name=sc.next();
        this.gender=sc.next();
        this.city=sc.next();
       this.doj1=sc.next();
   this.doj=Date.valueOf(doj1);
    }
   public void print()
    {
        System.out.println("id"+id+"/nname "+name+"/ngender "+gender+"/ncity "+city+"/ndoj "+doj);
    }
   
 }
class PermanentEmployee extends Employee
{
    private int salary;
    private double increament;
   public  void setSalary(int salary)
    {
        this.salary=salary;
    }
   
    public int  getSalary()
    {
        return salary;
    }
   public double getIncreament()
    {
        return increament;
    }
   public void accept()
    {
        super.accept();
        this.salary=sc.nextInt();
    }
    @Override
    public void calculateIncreament()
    {
        String s1="2017-01-01";
        Date d=Date.valueOf(s1);
        
        if(getDoj().compareTo(d)==-1)
        {
            increament=salary+salary*0.25;
        }
        else
            increament=salary+salary*0.10;
    }
       public void print()
       {
           System.out.println("salary"+salary+"/nincreament"+increament);
       }
}


public class InterfaceExample {
public static void main(String[] args) {
   PermanentEmployee p[]=new PermanentEmployee[2];
   for(int i=0;i<p.length;i++)
   {
       p[i]=new PermanentEmployee();
       p[i].accept();
       p[i].calculateIncreament();
       p[i].print();
   }
   
}
 
}
