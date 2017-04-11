package javaapplication1;
class Parent
{
    int a,b;
    public void  methodParent()
    {
        System.out.println("parent method");
    }
    public void common()
    {
        System.out.println("class A");
    }
    
}
class Child extends Parent
{
    int c,d;
    public void methodChild()
    {
        System.out.println("child methd");
    }
    @Override
    public void  common()
    {
        super.common();
        System.out.println("class B");//overridden method
    }
}
public class Runtime {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        p.methodParent();
        p.common();
        Parent p1;
        p1=c;
        p1.methodParent();//p1 can only access parent class method
        p1.common();//common() is an overridden method of child class 
        
    }
   
}
