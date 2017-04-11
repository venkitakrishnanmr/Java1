package javaapplication1;
class FinalDemo
{
    int i;
    final int j;//Any variable which is declared as final and once the valus is intialised cannot be change
    FinalDemo()
    {
        //i=10;
        j=20;
    }
    FinalDemo(int a)
    {
        i++;
        i=a;
        j=a;
        
    }
}
public class Final {
    public static void main(String[] args) {
        FinalDemo F=new FinalDemo(1000);
        System.out.println(F.i+" "+F.j);
    }
}
