package Collection;

import java.util.*;


public class Map1 {
    public static void main(String[] args) {
   
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("priya",860232043);
        hm.put("priy",860232043);
       
       for(Map.Entry<String,Integer> M:hm.entrySet())
       {
        System.out.println(M.getKey());
        System.out.println(M.getValue());
       }
    }
}
    
    

