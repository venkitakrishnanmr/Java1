


package javaapplication1;
class StaticDemo
{
    int i,j;
    static int a;
    StaticDemo(int m, int n, int o)
    {
        i=m;
        j=n;
        a=o;
       
        
    }
    static void Method()
    {
        System.out.println("static method");
    }
}

public class Static {
    public static void main(String[] args) {
        
    
    StaticDemo sd=new StaticDemo(10,20,30);
    StaticDemo sd1=new StaticDemo(1,2,3);
    StaticDemo sd2=new StaticDemo(100,200,300);
    StaticDemo sd3=new StaticDemo(1000,2000,3000);
    System.out.println("sd values"+sd.i+" "+sd.j+" "+sd.a);
    System.out.println("sd1 values"+sd1.i+" "+sd2.j+" "+sd2.a);
    StaticDemo.Method();
    
    
    
    }
    
    
    
    
    
    
    
    
    

}
