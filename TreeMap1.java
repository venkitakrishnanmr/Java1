package Collection;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<String, Integer>();
                tm.put("priya", 123);
                tm.put("kajal", 345);
                for(Map.Entry<String,Integer> m:tm.entrySet())
                {
                    System.out.println(m.getKey());
                    System.out.println(m.getValue());
    }
                 Stack<Integer> s=new Stack<Integer>();
                 System.out.println(s.push(5));
                 System.out.println(s.push(2));
                 s.pop();

    }
}
