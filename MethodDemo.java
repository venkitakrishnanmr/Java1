
class Method{
    int add(int a, int b)
    {
        int k=a+b;
        return k;
        //System.out.println("total :"+(a+b));   
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        
        int i=20;
        int j=20;
        int tot;
        Method m=new Method();
        tot=m.add(i,j);
        System.out.println("total"+tot);
    }
    
}

