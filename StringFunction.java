package javaapplication1;
public class StringFunction {
    public static void main(String[] args) {  
    char ch[]={'h','e','l','l','o'};
String s=new String(ch);
        System.out.println(s);
        System.out.println(s.length());
String S=new String ("How are you");
char[]chr=new char[S.length()];
char[]chr1=new char[S.length()];
chr1=S.toCharArray();
S.getChars(0,S.length(),chr,0);
    for(int i=0;i<chr1.length;i++)
    {
        System.out.println(chr1[i]);
    }
    String S1=new String("How are you");
    if(S.equals(S1))
            System.out.println("Equal");
    else
            System.out.println("Not Equal");
    if(S==S1)
            System.out.println("Equal");
    else
            System.out.println("Not Equal");
    String S2=S1.toUpperCase();
    if(S1==S2)
         System.out.println("Equal");
    else
            System.out.println("Not Equal");
    String S3=new String("How are you");
    String S4=new String("HOW are YOU");
    if(S3.equalsIgnoreCase(S4))    
        System.out.println("Equal");
    else
            System.out.println("Not Equal");
    
    }
}