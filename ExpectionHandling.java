package javaapplication1;

import java.util.Scanner;

public class ExpectionHandling 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int arr[]=new int [5];
        System.out.println("Enter the First Number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number");
        b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println("C is "+c);
            for(int i=0;i<=5;i++)
            {
                arr[i]=i;
            }
        }
        catch(ArithmeticException E)
                {
                    System.out.println("Generic Message");
                }       
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println("Index is outside the range");
        }
    }
    
}
