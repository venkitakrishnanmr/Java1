package javaapplication1;

import java.util.Scanner;

class Flight
{
    private int flightno;
    private String destination;
    private float distance;
    private float fuel;
    private void CalFuel()
    {
        if(distance<=1000)
            fuel=500;
             if (distance>1000&&distance<=2000)
                fuel=1100;
             else if ( distance>2000)
                 fuel=2200;
        
       
          
    }
    public void FEEDINFO(int flightno,String destination,float distance)
    {
        this.flightno=flightno;
        this.destination=destination;
        this.distance=distance;
        CalFuel();
    }
    public void ShowInfo()
    {
        System.out.println("flight number :"+flightno+" "+destination+distance+fuel);
    }
    
}
public class Class_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flightno;
        String destination;
        float distance;
        flightno=sc.nextInt();
        destination=sc.next();
        distance=sc.nextFloat();
        Flight f=new Flight();
        f.FEEDINFO(flightno, destination, distance);
        f.ShowInfo();
    }
    
}
