class Box
{
    private int length;
    private int breadth;
    private int depth;
    Box()
    {
        
        
    }
    Box(int l,int b,int d)
    {
        length=l;
        breadth=b;
        depth=d;
    }
    int volume()
    {
        return (length*breadth*depth);
    }
        
    
}
public class Constructor1 {
    
          public static void main(String[] args) {
              int a,c;
        Box b=new Box();
        Box b1=new Box(3,3,3);
     a= b.volume();
      c=  b1.volume();
              System.out.println("volume is:"+a+"volume is"+a);
           
    }
    
}
