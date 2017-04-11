package javaapplication1;
class Democls
{
    int i,j;
    public Democls(int a,int b)
    {
        i=a;
        j=b;
    }
    public String toString()
    {
        return "i is "+i+" j is "+j;
    }
}
class Democls1
{
    int i,j;
    public Democls1(int a,int b)
    {
        i=a;
        j=b;
    }
}
public class UncheckedExpection 
{
    public static void main(String[] args) 
    {
        Democls D=new Democls(10,20);
        Democls1 D1=new Democls1(100,200);
        System.out.println(D);
        System.out.println(D1);
    }
    
}
