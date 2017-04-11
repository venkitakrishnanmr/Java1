package Collection;

import java.util.ArrayList;
import java.util.Collections;
        ;

public class CollectionPro
{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(20);
        A.add(90);
        A.add(80);
        a1.add("two");
        for (int i=0;i<A.size();i++)
        {
        System.out.println(A.get(i));
        
    }   
        //A.remove(0);
        //System.out.println(A);
        System.out.println("sorted list") ;
        Collections.sort(A);
        System.out.println(A);
    }
   
}
