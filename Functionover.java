class overloading
{
    void sum(int a, int b)
    {
        System.out.println("total of 2 integer :"+(a+b));
    }
       
    void sum(double a,double b,double c)
    {
        System.out.println("total of three doubles"+(a+b+c));
    }
     void sum(double a,double b,int c)
    {
        System.out.println("total of three integer"+(a+b+c));
    }
}



public class Functionover {
    public static void main(String[] args) {
   int i=10,j=90,k=89;
   double d1=4.5,d2=5.5,d3=5;
   long l1,l2;
   overloading o=new overloading();
   o.sum(i, j);
   o.sum(d1, d2, d3);
   o.sum(i,j,k );
        System.out.println("class id"+o);
}
    
}
