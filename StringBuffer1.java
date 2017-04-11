package javaapplication1;
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        StringBuffer sb1=new StringBuffer("Hello");
        if(sb.toString().equals(sb1.toString()))
      System.out.println("Equal");
    else
            System.out.println("Not Equal");
        System.out.println(sb1.toString().toUpperCase());
    }
    
}
