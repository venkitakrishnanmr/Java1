package Annotation;

import java.lang.annotation.Annotation;

public class AnnoClassEx {
    public static void main(String[] args) {
        AnnoClass a=new AnnoClass();
        Annotation A[]=a.getClass().getAnnotations();
        for(Annotation A1:A)
        {
            Anno a1=(Anno)A1;
            System.out.println(a1.classD());
            System.out.println(a1.classN());
        }
        
    }
    
}
