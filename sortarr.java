package javaapplication1;

import java.util.Scanner;

public class sortarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,temp=0,j;
        int a[]=new int[5];
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
        for(j=i+1;j<a.length;j++)
        {
            if(
                    a[i]<a[j])
            {
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
            
        }
            
        }
        System.out.println("sorted array list is: ");
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);
        }
        
        
        
    }
    

