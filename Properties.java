package javaapplication1;
class Wages
{
    private int normal,extra;
    public void setNoh(int h)//this methd is for write only
    {
        if(h<=40)
        {
            normal=h;
            extra=0;
        }
        else
        {
            normal=40;
            extra=h-40;
        }
    }
     public int calculate()
     {
         int wg=(normal*2000)+(extra*3000);
         return wg;
         
     }
    }

public class Properties {
    public static void main(String[] args) {
        Wages w=new Wages();
        w.setNoh(48);
        System.out.println("your wage is :"+w.calculate());
    }
    
}
