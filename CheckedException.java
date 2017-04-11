package javaapplication1;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try
        {
            FileInputStream f=new FileInputStream("C:\\Users\\Trg\\Desktop\\priya.txt");
                    System.out.println(f.available());
        }
        catch(FileNotFoundException E)
        {
            System.out.println(E.getMessage());
        }
        catch(IOException E)
        {
            System.out.println(E.getMessage());
        }
    }
    
}
