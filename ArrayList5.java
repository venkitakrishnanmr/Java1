package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        String ch;
        String s=null;
        do
        {
        s= sc.next();
        al.add(s);
            System.out.println("Do you want to continue press yes if don't want to continue pess no");
            ch=sc.next();
        }while(ch=="yes");
        Iterator<String> it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
