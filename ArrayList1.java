package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        //String s;
       ArrayList<String> al=new ArrayList<String>();
       al.add("priya");
       al.add("kajal");
       al.add("venkat");
       al.add("thato");
       Iterator<String> it=al.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next() );
       }
       for(String s:al)
       {
           System.out.println(s);
       }
    }
    
}
