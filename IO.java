package javaapplication1;

import java.io.*;
class IOEx
{
    void print()
    {
        FileInputStream f=null;
        try
        {
        f=new FileInputStream("C:\\Users\\Trg\\Desktop\\priya.txt");
        int n=f.available();
       //  System.out.println(f.available());
         //  System.out.println(f.available()+1);
           // for(int i=0;i<n;i++)
            //{
            //System.out.print((char)f.read());
           
            //}
            byte[] b=new byte[n+3];
            b[0]='a';
            b[1]='b';
            b[2]='c';
            f.read(b, 3, n);
           // f.read(b);
            /*for (int i = 0; i <b.length; i++) {
                System.out.print(b[i]+" ");
            
        }*/
            String s=new String(b, 0, n);
            System.out.println(s);
        }
        catch(FileNotFoundException f1)
        {
            System.out.println(f1.getMessage());
        }
        catch(IOException i)
        {
            System.out.println(i.getMessage());
        }
            
            finally
            {
                try
                {
                 f.close();
                }
                catch(IOException i)
                {
                    System.out.println(i.getMessage());
            }
                    
    }
    }
}

public class IO {
    public static void main(String[] args) {
       IOEx i=new IOEx();
       i.print();
       
        }
       
      
    }
    
