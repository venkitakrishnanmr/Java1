package javaapplication1;

import java.util.Scanner;

class Bank
{
    private String bankname;
    private int regno;
    public void setBankname(String n)
    {
        bankname=n;
    }
    public void setRegno(int  r)
    {
        regno=r;
    }
    public String getBankname()
    {
        return bankname; 
    }
    public int  getRegno()
    {
        return regno; 
    }
    public  void print()
    {
        System.out.println("bankname :"+getBankname()+"\nregister number :"+getRegno());
    }
}
class Branch extends Bank
{
    private String area;
    private int pincode;
    private int phone;
    public void setArea(String a)
    {
     area=a;       
     }
    public void setPincode(int p)
    {
     pincode=p;       
     }
    public void setphone(int  p)
    {
     phone=p;       
     }
    public String getArea()
    {
        return area;
    }
    public int getPincode()
    {
        return pincode;
    }
    public int getPhone()
    {
        return phone;
    }
    public void print()
    { 
        super.print();
        System.out.println("area :"+getArea()+"\npincode :"+getPincode()+"\nphone :"+getPhone());
    }
}
class Customer extends Branch 
{
    private int ano,cphone;
    private String email,cname; 
    Transaction t[]=new Transaction[3];
     public void setAno(int a)
    {
        ano=a;
    }
    public void setCphone(int p)
    {
        cphone=p;
    }
    public void setEmail(String e)
    {
        email=e;
    }
    public void setCname(String n)
    {
        cname=n;
    }
    public int getAno()
    {
        return ano;
    }
    public int getCphone()
    {
        return cphone;
    }
    public String getEmail()
    {
        return email;
    }
    public String getCname()
    {
        return cname;
    }
    public void print()
    { 
        super.print();
        System.out.println("Account number :"+ano+"\ncustomer phone"+cphone+"\nemail :"+email+"\ncustomer name :"+cname);
    for(int i=0;i<3;i++)
    {
        t[i].print();
    }
    }
}
class Transaction
{
    private String transid,transdate,transtype,amount;
    Scanner sc=new Scanner(System.in);
   void getTrans()
   {
       transid=sc.next();
       transdate=sc.next();
       transtype=sc.next();
       amount=sc.next();
   }
   void print()
    {
        System.out.println("Transaction Id "+transid+"\nTransaction Date "+transdate+"\nTransaction Type "+transtype+"\nTransaction Amount "+amount);
    }
}
public class BankApplication 
{ public static void main(String[] args) {
        
    
  Customer c=new Customer();
   c.setBankname("hdfc");
  c.setRegno(1);
  c.setArea("indore");
  c.setPincode(452006);
  c.setphone(789798);
  c.setAno(12345);
  c.setCname("priya");
  c.setEmail("premlata.mishara@gmail.com");
  c.setCphone(678666786);
for(int i=0;i<3;i++)
{
    c.t[i]=new Transaction();
    c.t[i].getTrans();
}
//Bank b;
  //b=c;
  c.print();
}
}
