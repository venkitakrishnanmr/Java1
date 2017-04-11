package Collection;

import java.sql.Date;

public class Employee {
private int empno;
private String ename;
private Date doj;

    public Employee(int empno, String ename, Date doj) {
        this.empno = empno;
        this.ename = ename;
        this.doj = doj;
    }
    public String toString()
    {
        return "empno "+empno+"ename "+ename+"doj "+doj;
    }

}
