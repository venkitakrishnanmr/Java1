package javaapplication1;
public class Assignment1 {
    public static void main(String[] args) {
        int i,c=0;
        for(i=0;i<=100;i++)
        {
            if(i%7==0)
            {
                c++;
            }
        }
        System.out.println(c+" numbers are divisible by 7 ");
    }
    
}
