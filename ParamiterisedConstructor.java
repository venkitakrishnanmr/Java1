
        
        
        
import java.util.Scanner;

class Student{
    private int sno,m1,m2,m3;
    private String sname;
    private double tot,avg;
    private String res,pass,con,fail;
    
    Student(int sno,int m1,int m2,int m3,String sname)
    {
        this.sno=sno;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.sname=sname;
     
        con="try again";
    }
    void calculateResult ()
    {
    tot=m1+m2+m3;
    avg=tot/3;
    if(m1>=50&&m2>=50 && m3>50)
    {
         if(avg>=90){
            res="A+"; 
         pass="pass";
         con="congratulation";
         }
         else if(avg>=80)
         {
             res="A";
             pass="pass";
             con="congratulation";
         }
         else if(avg>=70)
         {
                res="B";
                pass="pass";
                con="congratulation";
         }
         else if(avg>=60)
         {
             res="C";
             pass="pass";
             con="congratulation";
         }
         else if(avg>=50)
         {
             res="D";
             pass="pass";
             con="congratulation";
         }
    }
    
    else
    {
       res="fail";
       
    }
    }
    void display()
    {
        if(res=="fail"){
            System.out.println("student name :"+sname+"\nstudent number :"+sno+"\njava :"+m1+"\ntesting :"+m2+"\nims :"+m3+"\ntotal :"+tot+"\naverage :" +avg+"\n"+res+"\n"+con);
        
        }
        else
            
        System.out.println("student name :"+sname+"\nstudent number :"+sno+"\njava :"+m1+"\ntesting :"+m2+"\nims :"+m3+"\ntotal :"+tot+"\naverage :" +avg+"\ngrade :"+res+"\n"+pass+"\n"+con);
       
       
        
    }

}

public class ParamiterisedConstructor {
 public static void main(String[] args) {
     int sno,m1,m2,m3;
     String sname;
      Scanner sc=new Scanner(System.in);
      sno=sc.nextInt();
      m1=sc.nextInt();
      m2=sc.nextInt();
      m3=sc.nextInt();
      sname=sc.next();
     Student s=new Student(sno,m1,m2,m3,sname);
     s.calculateResult();
     s.display();
       
}
   
}
