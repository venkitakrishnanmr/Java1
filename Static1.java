
package javaapplication1;

class StaticDemo1{
    int i,j;
    static int a;
    static void Method1(){
       a=9;
       
        System.out.println("Hi Method1,How are you feeling today?");
        //Method3();    
    }
    void Method2(){
       Method1();
       Method3(); 
       System.out.println("Hi Method2,How are you feeling today?");
       
    }
    void Method3(){
        a=9;
        i=7;
        j=2;
        System.out.println("Hi Method3,How are you feeling today?");
        
    }
}
public class Static1 {
    
    public static void main(String[] args) {
        StaticDemo1 sObj=new StaticDemo1();
        StaticDemo1.Method1();
        sObj.Method1();
        Static1 s=new Static1();
      
        
        
    }
}
