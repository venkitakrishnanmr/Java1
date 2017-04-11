package javaapplication1;
class Shape
{
     static int i,j;
     triangle t;
    Shape()
    {
       triangle  t=new triangle();//late binding
       //t.a=9;
    }
    
    static class triangle
    {
       static int a,b;
        triangle()
        {
           
            i=9;
            System.out.println("triangle");
        }
    }
    void m()
    {
        int m=01,n;
        System.out.println("m1");
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Shape s=new Shape();
        Shape.triangle t=new Shape.triangle();
     //  Shape.triangle t=new Shape.triangle();
       
     s.t.a=10;//bcs of late binding we can access lacal variable of inner class in main function
   s.i=0;
  
    
    }
    
}
