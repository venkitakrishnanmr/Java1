public class Salary {
    public static void main(String[] args) {
   int salary=5000,tax;
   if(salary>200000)
   {
       tax=(salary*20)/100;
       System.out.println("your salary tax is "+tax+"rs");
   }
   else if(salary>=100000)
           {
               tax=(salary*10)/100;
               System.out.println("your salary tax is "+tax+"rs");
           }
   else if(salary>=50000)
   {
       tax=(salary*5)/100;
       System.out.println("your salary tax is "+tax+"rs");
   }
   else
            System.out.println("no tax for your salary");
           
               
           
}
    
}
