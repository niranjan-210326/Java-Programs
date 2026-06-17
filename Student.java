//Prog 28
import java.util.*;
class Student
{
    Scanner sc=new Scanner(System.in);
    int roll;
    String name,dob;
    void inputdata()
    {
        System.out.println("Enter the name of the student:");
        name=sc.nextLine();
        System.out.println("Enter the date of birth of the student:");
        dob=sc.nextLine();
        System.out.println("Enter the roll number of the student:");
        roll=sc.nextInt();
    }
    void printdata()
    {
        System.out.println("Name="+name);
        System.out.println("Date of birth="+dob);
        System.out.println("Roll number="+roll);
    }
    public static void main(String args[])
    {
        Student obj=new Student();
        Marks ob=new Marks();
        obj.inputdata();
        ob.readdata();
        ob.compute();
        obj.printdata();
        ob.showdata();
    }
}
class Marks
{
    Scanner sc=new Scanner(System.in);
    float p,c,m,cs,e,tot,per;
    char gd;
    void readdata()
    {
        System.out.println("Enter physics mark:");
        p=sc.nextFloat();
        System.out.println("Enter chemistry mark:");
        c=sc.nextFloat();
        System.out.println("Enter maths mark:");
        m=sc.nextFloat();
        System.out.println("Enter computer science mark:");
        cs=sc.nextFloat();
        System.out.println("Enter english marks:");
        e=sc.nextFloat();
    }
    void compute()
    {
        tot=p+c+m+cs+e;
        per=tot/5;
        if(per>=90)
        {
            gd='A';
        }
        else if(per>=60 && per<90)
        {
            gd='B';
        }
        else if(per>=40 && per<60)
        {
            gd='C';
        }
        else
        {
            gd='D';
        }
    }
    void showdata()
    {
        System.out.println("Physics mark="+p);
        System.out.println("Chemistry mark="+c);
        System.out.println("Maths mark="+m);
        System.out.println("Computer science mark="+cs);
        System.out.println("English mark="+e);
        System.out.println("Total marks="+tot);
        System.out.println("Percentage marks="+per);
        if(gd=='D')
        {
            System.out.println("Result is fail");
        }
        else
        {
            System.out.println("Pass");
            System.out.println("Grade="+gd);
        }
    }
}