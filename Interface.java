package javaapplication1;
interface Shape2
{
    int i=10;
   void Area();
    void Perimeter();
}
class Child2 implements Shape2
{   int a;
    public Child2()
    {
        System.out.println("i="+i);
        a=i;
        a++;
        System.out.println("a="+a);
    }
   public void Perimeter()
    {
        
    }
    public void Area()
    {
        
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
    Child2 C=new Child2();  
    
    }
    
}
