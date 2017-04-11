package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutput
{
    void SendData()
    {
       String s="priya is intelligent jgklsdjfkldsjfrgfdgfgdfgdsfs";
        FileOutputStream f=null;
        int n=0;
               //System.out.println(n);
        try
        {
            
        f=new FileOutputStream("C:\\Users\\Trg\\Desktop\\priy.txt");
        byte[] b=s.getBytes(); 
        //f.write();
        //for(int i=0;i<s.length();i++)
       // {
       //     f.write(s.charAt(i));
       // }
       
      f.write(b,5,s.length()-5);
     
        }
       
        catch(FileNotFoundException f1)
        {
            System.out.println(f1.getMessage());
        }catch(IOException i)
        {
            System.out.println(i.getMessage());
        }
        finally
        {
            try{
            f.close();
            }
            catch(IOException i)
            {
                System.out.println(i.getMessage());
            }
        }
    }
}
public class FileOutputEx {
    public static void main(String[] args) {
        FileOutput f=new FileOutput();
        f.SendData();
    }
    
}
