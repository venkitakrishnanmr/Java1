package javaapplication1;

import java.util.Scanner;
class name{
    
    name()
    {
        System.out.println("Constructor!");
    }
}

public class Assignment7 {
    static
    {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        name h=new name();
        System.out.println("main");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int c=0;
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            c=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }
           
            if(c==2)
            {
                System.out.println(" "+a[i]);
            }
            else
            {
                a[i]=a[i]+10;
                System.out.println(" "+a[i]);
            }
        }
    }
    
}
