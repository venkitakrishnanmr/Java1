package javaapplication1;

import java.util.Scanner;

class AgeException extends Exception
{
    private String Msg;
    AgeException(String St)
    {
        super(St);
    }
}
public class UserDefinedException 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter the Age");
        age=sc.nextInt();
        try
        {
            if(age<21||age>58)
            throw new AgeException("Age is under 21 or over 58");
        }
        catch(AgeException A)
        {
            System.out.println(A.getMessage());
        }
    }
    
}
