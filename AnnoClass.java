package Annotation;
@Anno(classN = "AnnoClass",classD = "this class will fill eno")
public class AnnoClass {
    int eno;
    @Anno()
    void get()
    {
        this.eno=6;
    }
}
