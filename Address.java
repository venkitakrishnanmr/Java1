package javaapplication1;
class Addres
{
    String hno;
    String streetname;
    String area;
    String city;
    String pincode;
    public Addres(String hno,String streetname,String area,String city,String pincode )
    {
        this.hno=hno;
        this.streetname=streetname;
        this.area=area;
        this.city=city;
        this.pincode=pincode;
       }
    void print()
    {
        System.out.println(hno+streetname+area+city+pincode);
    }
}
 class Emp
 {
     int empno;
     String ename;
     Addres PA,TA;
     Emp(int empno,String ename,Addres PA,Addres TA)
     {
         this.empno=empno;
         this.ename=ename;
         this.PA=PA;
         this.TA=TA;
      }
     void print1()
     {
         System.out.println("employee number :"+empno+"\nemployee name :"+ename);
         System.out.print("permanent Address :");
         PA.print();
         System.out.print("Temporary Address :");
         TA.print();
     }
    /*void print()
     {
         System.out.println("employee number :"+empno+"\nemployee name :"+ename+"\npermanetnt Address :"+PA.hno+PA.streetname+PA.area+" "+PA.city+" "+PA.pincode);
         System.out.println("Temprary Address :"+TA.hno+TA.streetname+TA.area+" "+TA.city+" "+TA.pincode);     
     }*/
 }

        
public class Address {
    public static void main(String[] args) {
       Addres PA=new Addres("63","street 1 ","sangamnagar"," indore ","452006");
       Addres TA=new Addres("66","street 2 ","marimata"," indore ","452007");
       Emp e=new Emp(49826,"priya",PA,TA);
       e.print1();
       
    }
}
