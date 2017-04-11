package javaapplication1;

import java.util.Scanner;

class Shape1
{
     double d1,d2,a,p;
     Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter dimention1:\n enter dimention2:");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
    }
    void print()
    {
        System.out.println("dimention 1 is:"+d1+"\ndimention 2 is:"+d2);
        System.out.println("area is:"+a+"\nparameter is:"+p);
    }
    double getArea(){
        return a;
    }
}
class Rectangle extends Shape1
{
       
    void area()
    {
        
       accept();
        
        a=d1*d2;
        p=2*(d1*d2);
        
    }
    
}
class Square extends Shape1
{
    void area()
    {
        //accept();
        a=d1*d1;
        p=4*d1;
        print();
    }
    
}

public class Inheritance3 {
    public static void main(String[] args) {
       
        Rectangle r=new Rectangle();
        Square s=new Square();
        r.accept();
        s.accept();
        r.area();
        s.area();
        
        
    }
    
}
