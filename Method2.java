
import java.util.Scanner;

class Salar
{
    double caltax(double basicsal)
    {
         double tax;
        if(basicsal>10000)
            tax=basicsal*10/100;
        else if(basicsal>5000)
             tax=basicsal*5/100;
        
        else
            tax=basicsal*2/100;
        return tax;
    }
  double  increament(double basicsal)
    {
        double inc; 
        if(basicsal>20000)
        
            inc=basicsal+(basicsal*15/100);
         else   if(basicsal>15000)
                inc=basicsal+(basicsal*10/100);
            else  if(basicsal>10000)
                inc=basicsal+(basicsal*7/100);
            else  if(basicsal>5000)
                inc=basicsal+(basicsal*5/100);
              

            
            else 
               inc=basicsal+(basicsal*3/100);
        return inc;
    }
}
public class Method2 {
    public static void main(String[] args) {
        double basicsal,rec,inc;
        Scanner s=new Scanner(System.in);
        basicsal=s.nextDouble();
        Salar sc=new Salar();
        rec=sc.caltax(basicsal);
        inc=sc.increament(basicsal);
        System.out.println("tex is"+rec);
        System.out.println("basic salary is"+inc);
    }
    
}
