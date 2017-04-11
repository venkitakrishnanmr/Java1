package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;



public class EmployeeUser {
    public static void main(String[] args) 
    {
      Employee e=new Employee();
      Permanent p=new Permanent();
     Annotation A[]= e.getClass().getAnnotations();
      Annotation P1[]=e.getClass().getAnnotations();
        for (Annotation A1 : A) {
            ClassAnnotation ca=(ClassAnnotation )A1;
             System.out.println("class name :"+ca.Classname());
             System.out.println(ca.Description());
        }
      try
      {
     Method m= e.getClass().getMethod("accept");
     Annotation A1[]=m.getAnnotations();
     for(Annotation a:A1)
     {
          MethodAnnotation ma=(MethodAnnotation)a;
          System.out.println("syntax :"+ma.syntax());
          System.out.println("Description :"+ma.Description());
     }
      }
      catch(NoSuchMethodException n)
      {
          System.out.println(n.getMessage());
      }
    }
    
}
