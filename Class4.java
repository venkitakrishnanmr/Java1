package javaapplication1;

import java.util.Scanner;

class Sells
{
    int pno;
    String pname;
    double tra,discnt,bllamt;
    void getdata(){
        Scanner s=new Scanner(System.in);
        pno=s.nextInt();
        pname=s.next();
        tra=s.nextDouble();
        //discnt=s.nextDouble();
        //bllamt=s.nextDouble();
     
        
    }
    void calulate(){
        if(tra>10000)
        {
            bllamt=tra-tra*10/100;
             if(tra>5000)
                bllamt=tra-(tra*(5/100));
                
        }
        else
            bllamt=tra-(tra*(2/100));
    }
   void showDAta()
    {
        System.out.println("product no:"+pno+"\nprodect name:"+pname+"\ntransaction amount:"+tra+"\n bill amount"+bllamt); 
    }
    
}
public class Class4 {
    public static void main(String[] args) {
      Sells s=new Sells();
      s.getdata();
     s.calulate();
     s.showDAta();
      
      
    }
    
}
