package javaapplication1;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        int a[]=new int[10];
        System.out.println("enter any number ");
        n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]>50)
             sum=sum+a[i];
        }
        System.out.println("sum of all numbers which are greater than"+n+"\n"+sum);
    }
    
}
