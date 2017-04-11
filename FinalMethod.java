package javaapplication1;
class FinalMethodEx
{
    void nonfinal()
    {
        System.out.println("Non Final Method");
    }
    final void finalmethod()
    {
        System.out.println("Final Method");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        FinalMethodEx F=new FinalMethodEx();
        F.nonfinal();
        F.finalmethod();
    }
}
 