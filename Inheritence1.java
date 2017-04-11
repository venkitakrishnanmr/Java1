package javaapplication1;

import java.util.Scanner;

class Supercls
{
 private int sup_i,sup_j;
 Supercls()
  {
      Scanner sc=new Scanner(System.in);
     sup_i=sc.nextInt();
      sup_j=sc.nextInt();
  }
 void print()
         {
             System.out.println("super class variable"+sup_i+" "+sup_j);
         }
 }
class Subcls extends Supercls
{
    private int sub_i,sub_j;
     Subcls()
     {
      Scanner sc=new Scanner(System.in);
      sub_i=sc.nextInt();
      sub_j=sc.nextInt();
  }
     void print()
         {
             System.out.println("sub class variable: "+sub_i+" "+sub_j);
         }
 
}
public class Inheritence1 {
    public static void main(String[] args) {
        Supercls s=new Supercls();
        Subcls s1=new Subcls();
        //System.out.println("superclass "+s.sup_i+" " +s.sup_j);
        //System.out.println("subclass "+s1.sup_i+" " +s1.sup_j+" "+s1.sub_i+"  " +s1.sub_j);   
         //System.out.println("superclass "+s.sup_i+" " +s.sup_j);
         s.print();
         s1.print();
         s1.print();
    
    }
    
    
}
