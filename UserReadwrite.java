package file;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserReadwrite {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        FileWriter f=null;
        FileReader F1=null;
        int i1;
        try
        {
            f=new FileWriter("C:\\Users\\Trg\\Desktop\\riya.txt");
        for(int i=0;i<s.length();i++)
        {
            f.write(s.charAt(i));
       
        }
        
        
        
        
       f.close();
             F1=new FileReader("C:\\Users\\Trg\\Desktop\\riya.txt");
       
      
       
       while((i1=F1.read())!=-1)
               {
                   System.out.print((char)i1);
               }
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException i)
        {
            System.out.println(i.getMessage());
        }
        finally
        {
            try
            {
           // f.close();
            F1.close();
            }
            catch(IOException E)
                    {
                    System.out.println(E.getMessage());
                    }
        }
    }
    
}
