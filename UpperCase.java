package javaapplication1;

import java.util.Scanner;

class Upper
{
        private String name;

    public void getName(String n)
    {
      name=n.toUpperCase();
    }
    public String setName()
    {
        return name;
    }
}
public class UpperCase {
    public static void main(String[] args) {
        String name;
        Upper u=new Upper();
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        u.getName(name);
       
        System.out.println(u.setName());
    }
    
}
