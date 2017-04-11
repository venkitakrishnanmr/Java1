package javaapplication1;
interface Vehicles
{
    void hasWheels();
    void hasEngine();
}
interface Car extends Vehicles
{
    void hasAirbags();
    void hasRoof();
}
interface MotorCycle extends  Vehicles
{
    void hasStand();
    void hasPedal();
}
class Travel implements Car,MotorCycle
{
    public void hasWheels()
    {
        
    }
    public void hasEngine()
    {
        
    }
    public void hasAirbags()
    {
        
    }
    public void hasRoof()
    {
        
    }
    public void hasStand()
    {
        
    }
    public void hasPedal()
    {
        
    }
}
public class Interface1 {  
    public static void main(String[] args) {
        Vehicles V=new Travel();
        
        Car C=new Travel();
       Travel T=new Travel();
      
    }
}
