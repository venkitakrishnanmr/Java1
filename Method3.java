
import java.util.Scanner;

class Customer
{   
    String calcualte(char ctype, double bllamnt)
    {     
        String status=""; 
        double dis;
            if(ctype=='Y'|| ctype=='y')
    {
        if(bllamnt>25000){
            dis=bllamnt*30/100;
            status="your discount ammount is:"+dis;
        }
        else if(bllamnt>15000)
        {
            dis=bllamnt*20/100;
          status="your discount ammount is:"+dis;
        }
        else if(bllamnt<15000){
              dis=bllamnt*10/100;
               status="your discount ammount is:"+dis;
        }
       
    
         else   if(ctype=='n'|| ctype=='N'){
            if(bllamnt>25000)
            {
            dis=bllamnt*12/100;
             status="your discount ammount is:"+dis;
            }
        else if(bllamnt>15000)
        {
            dis=bllamnt*7/100;
             status="your discount ammount is:"+dis;
        }       else if(bllamnt<15000){
            dis=bllamnt*0;
             status="no discount:"+dis;
        }
         }
    }
            else
            status="invalid customer type";
                
        
            return status;
}
}

public class Method3 {
public static void main(String[] args) {
   int cid;
   String cname;
   char ctype;
   double bllamnt;
   Scanner sc=new Scanner(System.in);
    System.out.println("enter customer id,customer type 'y','Y' or 'n',N,bllamnt");
   cid=sc.nextInt();
   ctype=sc.next().charAt(0);
   bllamnt=sc.nextInt();
   Customer c=new Customer();
  String dis=c.calcualte(ctype, bllamnt);
    System.out.println(dis);
   
           
  // double totalamnt;
}
    
}
