package javaapplication1;

import java.util.Scanner;

public class totalMark {
    public static void main(String[] args) {
        int marks[]=new int[5];
        int i,sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("total of marks :"+sum);
        avg=sum/marks.length;
        System.out.println("average of marks :"+avg);
        if(avg>50)
        {
            System.out.println("pass");
        }else
            System.out.println("fail");
                
        
    }
    
}
