package javaapplication1;
abstract class ShapeClass
{
    int d1,d2;
    abstract double area();
    abstract double parimeter();
    abstract void print();
}
class RectangleClass extends ShapeClass
{
    double area()
    {
        return d1*d2;
    }
    double parimeter()
    {
        return 2*(d1+d2);
    }
    void print()
    {
        System.out.println("Area of rectangle :"+area());
        System.out.println("parimeter of rectangle :"+parimeter());
    }
}
class SquareClass extends ShapeClass
{
    double area()
    {
        return d1*d1;
       
    }
    double parimeter()
    {
        return 4*d1;
    }
    void print()
    {
        System.out.println("area of square :"+area());
        System.out.println("perimeter of square :"+parimeter());
    }
}
public class Area 
{
    public static void main(String[] args) {
        ShapeClass s;
        RectangleClass r=new RectangleClass();
        s=r;
        s.d1=10;
        s.d2=20;
        s.print();
        SquareClass sq=new SquareClass();
        s=sq;
        s.d1=2;
        s.d2=3;
        
        s.print();
    }
    
}
