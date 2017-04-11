package javaapplication1;

import java.util.Scanner;

public class Exercisevow {
    public static void main(String[] args) {
      
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=S.next();
        //System.out.println(name.length());
        //System.out.println(name.charAt(0));
                for(int i=0;i<name.length();i++)
                {
                    if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
                    System.out .println(name.charAt(i));
                }
        
        
    }
    
    
}
