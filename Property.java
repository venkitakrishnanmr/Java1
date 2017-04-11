package javaapplication1;
class SetgetEx
{
    private String name;
    private int id;
    /*public void setId(int i)
    {
        id=i;
    }*/
    public int getId(int i)
    {
        id=i;
        return id;
    }
}
public class Property {
    public static void main(String[] args) {
        SetgetEx se=new SetgetEx();
        //se.setId(10);
        System.out.println(se.getId(9));
    }
    
}
