
class ConstructorDemo
{ double i;
    public ConstructorDemo()
            {
                System.out.println("default constructor");
            }
     public ConstructorDemo(int a)
            {
                 i=a;
                System.out.println("paramiterised constructor:"+a);
            }
     public ConstructorDemo(int a,double b)
            {
                 i=a+b;
                System.out.println("paramiterised constructor:"+a+", "+b);
                
                
            }
      
        
    void method1()
    {
        System.out.println("method");
    }
}



public class Constructor {
    public static void main(String[] args) {
        int a=9;
        double b=7.8;
        ConstructorDemo cd=new ConstructorDemo(a);
      //  ConstructorDemo cd1=new ConstructorDemo();
        ConstructorDemo cd2=new ConstructorDemo(a,b);
        
        System.out.println(cd.i);
            
        
    }
   
}
