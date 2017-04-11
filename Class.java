package javaapplication1;
   class Student{
       int eno;
       String mob;
       String name,add; 
       
   }
public class Class {
    public static void main(String[] args) {
        Student s=new Student();
        s.eno=1;
        s.mob="8602320342";
        s.name="priya";
        s.add="indore";
        System.out.println("enrollment no:"+s.eno+" \nmobile number :"+s.mob+"\n name :"+s.name+"\n place :"+s.add);           
        
    }
    
}
