package javaapplication1;
abstract class parentClass 
{
    int i,j;
    abstract void display();//....declararion // whithin 
    //abstract void print();    
}
class childClass extends parentClass
{
    void display()
    {
        //partial implimentation
    }
}
/*class grandChild extends parentClass
{
    void display()
    {
        
    }
    void print()
    {
        
    }
    
}*/
public class Abstract {
    public static void main(String[] args) {
    parentClass p;    
   childClass c=new childClass();     
    }
}
