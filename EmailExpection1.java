package javaapplication1;

import java.util.Scanner;

class EmailExpection extends Exception
{
    /*EmailExpection(String St)
    {
        super(St);
    }*/
    public String toString()
    {
        return "Invalid Email ID";
    }
}
public class EmailExpection1 
{
    public static void main(String[] args) 
    {
        String a;
        int co=0,c=0,m=0;
        System.out.println("Enter the Email Id");
        Scanner Sc=new Scanner(System.in);
        a=Sc.next();
        try
        {
            for(int i=0;i<a.length();i++)
             if(a.charAt(i)=='@')
             {
             co++;
             m=i;
             }
            for(int j=m;j<a.length();j++)
            {
            if(a.charAt(j)=='.')
                c++;
            }
                
             if((co==1)&& (c==1 || c==2))
                    System.out.println("Good");
            else
                throw new EmailExpection();
        }
        catch(EmailExpection E)
        {
            System.out.println(E);
        }
    }
}
