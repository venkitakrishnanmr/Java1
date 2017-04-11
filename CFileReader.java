package Collection;
import java.io.*;
public class CFileReader {
    public static void main(String[] args) 
    {
      FileReader f=null;
      int i=0;
      try
      {
          char[] c=new char[50];
      f=new FileReader("C:\\Users\\Trg\\Desktop\\priya.txt");
      f.read(c);
      String s=new String(c,0,c.length);
          System.out.println(s+"");
          
     
    /* while((i=f.read())!=-1)
      {
          System.out.print((char)i+"");
      }*/
      }
      catch(FileNotFoundException f1)
      {
          System.out.println(f1.getMessage());
      }
      catch(IOException i1)
      {
          System.out.println(i1.getMessage());
      }
    }
    
}
