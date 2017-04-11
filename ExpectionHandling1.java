package javaapplication1;

import java.util.Scanner;

public class ExpectionHandling1 {
  public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int arr[]= new int [5];
        System.out.println("Enter the First Number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number");
        b=sc.nextInt();
        try
        {
            if(b==0)
            {
                throw new ArithmeticException("Cannot divide");         
            }
            else
            {
            c=a/b;
            System.out.println("C is "+c);
            }
            int i=5;
            if(i==5)
            {
                throw new ArrayIndexOutOfBoundsException("Index range is out of bound");
            }
        }
        catch(ArithmeticException E)
                {
                    System.out.println(E.getMessage());
                }       
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println(E.getMessage());
        }
    }    
}
