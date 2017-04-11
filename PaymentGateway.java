package javaapplication1;
interface IPayable
{
    double getPaymentAmount();
}
class Invoice implements IPayable
{
    private int partno,quantity;
    private String partdes;
    private double priceperitem;
    Invoice(int partno,String partdes,int quantity,double priceperitem)
    {
        this.partno=partno;
        this.partdes=partdes;
        this.quantity=quantity;
        this.priceperitem=priceperitem;
    }
        /*public void setpartno(int partno)
        {
            this.partno=partno;
        }
        public void setpartdes(String partdes)
        {
            this.partdes=partdes;
        }
        public void setquantity(int quantity)
        {
            this.quantity=quantity;
        }
        public void setpricerperitem(double priceperitem)
        {
            this.priceperitem=priceperitem;
        }
        public int getpartno()
        {
            return partno;
        }
        public String getpartdes()
        {
            return partdes;
        }
        public int getquantity()
        {
            return quantity;
        }
        public double getpriceperitem()
        {
            return priceperitem;
        }*/ 
        public String print()
        {
            String a;
            a="Part Number is "+partno+"\nPart Description is "+partdes+"\nQuantity is "+quantity+"\nPrice Per Item is "+priceperitem;
            return a;
        }
        public double getPaymentAmount()
        {
            double pay=quantity*priceperitem;
            return pay;
        }
    }
    abstract class Employee4 implements IPayable
    {
        private String fname,lname;
        private long ssno;
        Employee4(String fname,String lname,long ssno)
        {
            this.fname=fname;
            this.lname=lname;
            this.ssno=ssno;
        }
       /* public void setfname(String fname)
        {
            this.fname=fname;
        }
        public void setlname(String lname)
        {
            this.lname=lname;
        }
        public void setssno(long ssno)
        {
            this.ssno=ssno;
        }
        public String getfname()
        {
            return fname;
        }
        public String getlname()
        {
            return lname;
        }
        public long getssno()
        {
            return ssno;
        }*/
    public String print()
    {
        String b;
        b="First Name is "+fname+"\nLast Name is "+lname+"\nSerial Number is "+ssno;
        return b;
    }           
}
class SalariedEmployee extends Employee4
{
    double weeksalary;
    /*public void setweeksalary(double weeksalary)
    {
        this.weeksalary=weeksalary;
    }
    public double getweeksalary()
    {
        return weeksalary;
    }*/
    SalariedEmployee(String fname,String lname,long ssno,double weeksalary)
    {
        super(fname,lname,ssno);
        this.weeksalary=weeksalary;
    }
    public double getPaymentAmount()
    {   
        return weeksalary;
    }
    public String print()
    {
        String s=super.print();
        String c=""+s+"\nWeek Salary is "+getPaymentAmount();
        return c;
    }
}
public class PaymentGateway 
{
    public static void main(String[] args) {
        Invoice I=new Invoice(1,"Mobile Phones",4,10000);
        SalariedEmployee S=new SalariedEmployee("Shyam","Venkat",944484561,1500);
        S.getPaymentAmount();
        System.out.println(I.print());
        System.out.println(S.print());
    }
}
