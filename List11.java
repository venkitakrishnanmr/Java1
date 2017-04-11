package Collection;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class List11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> al=new ArrayList<Employee>();
        char ch;
        int Eno;
        String En;
        Date d;
        Employee E5=null;
        do
        {
        Eno=sc.nextInt();
        En=sc.next();
        d=Date.valueOf(sc.next());
        E5=new Employee(Eno,En,d);
        al.add(E5);
            System.out.println("Do you want to continue or not");
            ch=sc.next().charAt(0);
        }while(ch=='y');
        for (Employee E6 :al)
        {
            System.out.println(E6);
        }
            }
    
}
