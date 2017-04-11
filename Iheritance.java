package javaapplication1;
class parent//super class
{
    parent()
    {
        System.out.println("parent default");
    }

    
}
class child extends parent//sub or derived class
{
    child()
    {
        System.out.println("child default");
    }
     child(int a)
     {
         System.out.println("with 1 para"+a);
     }
     child(int a, int b)
     {
         System.out.println("with 2 para"+a+b);
     }
   }
/*class grandChild extends child
{
     grandChild()
     {
         System.out.println("grand child");
     }
}*/
public class Iheritance {
    public static void main(String[] args) {
//grandChild c=new grandChild();parent p=new parent();
child c=new child();
child c1=new child(5);
child c2=new child(4,6);
        
    }
    
}
