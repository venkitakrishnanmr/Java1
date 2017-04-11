package javaapplication1;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter 10 values");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("repeated values are");
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[i]);
            }
        }
    }
    
}
