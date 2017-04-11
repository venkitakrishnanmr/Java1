
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int n[]=new int[6];
   char c[]=new char[6];
   char ch;
   int num,sum=0;
    System.out.println("enter character size 6");
   for(int i=0;i<c.length;i++)
   {
       c[i]=sc.next().charAt(0);
   }
    System.out.println("enter integers size of 6");
   for(int i=0;i<n.length;i++)
   {
       n[i]=sc.nextInt();
   }
    System.out.println("enter any character ");
    ch=sc.next().charAt(0);
    System.out.println("enter any number ");
    num=sc.nextInt();
   for(int i=0;i<c.length;i++)
   {
       if(c[i]==ch && n[i]>num)
       {
           sum=sum+n[i];
       }
   }
    System.out.println("output"+sum);
}
    
}
a
        b
