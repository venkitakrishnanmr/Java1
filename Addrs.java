
package javaapplication1;

import java.util.Scanner;

class Addres1
{
    String hno;
    String streetname;
    String area;
    String city;
    String pincode;
    public Addres1(String hno,String streetname,String area,String city,String pincode )
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
 class Emp1
 {
     int empno;
     String ename;
     Addres1 PA,TA;
     Emp1(int empno,String ename,Addres1 PA,Addres1 TA)
     {
         this.empno=empno;
         this.ename=ename;
         this.PA=PA;
         this.TA=TA;
      }
     void print2()
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

        
public class Addrs {
    public static void main(String[] args) {
    /*   Addres PA=new Addres("63","street 1 ","sangamnagar"," indore ","452006");
       Addres TA=new Addres("66","street 2 ","marimata"," indore ","452007");
       Emp e=new Emp(49826,"priya",PA,TA);
       e.print1();*/
    Emp1 []em=new Emp1[2];
    Addres1 pa1,ta1;
    Scanner inp=new Scanner(System.in);
    
    
    
        for (int i = 0; i < em.length; i++) 
        {
    
            System.out.println("Enter number and name:");
            int empno=inp.nextInt();
            String ename=inp.next();
            System.out.println("Enter permanent Address:");
            String Phno=inp.next();
            String Pstreetname=inp.next();
            String Parea=inp.next();
            String Pcity=inp.next();
            String Ppincode=inp.next();
            
            System.out.println("Enter temporary Address:");
            String Thno=inp.next();
            String Tstreetname=inp.next();
            String Tarea=inp.next();
            String Tcity=inp.next();
            String Tpincode=inp.next();
            pa1=new Addres1(Phno,Pstreetname,Parea,Pcity,Ppincode);
            ta1=new Addres1(Thno,Tstreetname,Tarea,Tcity,Tpincode);
           }
    
        for (int r = 0; r < 2; r++)
        {
           em[r].print2();
        }
    }
}