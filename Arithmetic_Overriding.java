import java.util.*;
public class Arithmetic_Overriding
{
    public static void main(String args[])//main method
    {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers=");//getting the two numbers from the user
        a=sc.nextDouble();
        b=sc.nextDouble();
        division ob=new division();
        ob.arith(a,b);//creating an object for the arith
    }
}
class addition
{
    public void arith(double x,double y)
    {
        //adding two numbers
        double arith1=x+y;
        System.out.println("Sum of the numbers= "+arith1);
    }
}
class subtraction extends addition
{
    public void arith(double x,double y)
    {
        //subtracting two numbers
        super.arith(x,y);//super keyword to extend from class Arithmetic_Overriding
        double arith2=x-y;
        System.out.println("Difference of the numbers= "+arith2);
    }
}
class multiplication extends subtraction
{
    public void arith(double x,double y)
    {
        //multiplying two numbers
        super.arith(x,y);//super keyword to extend from class Arithmetic_Overriding
        double arith3=x*y;
        System.out.println("Product of the numbers= "+arith3);
    }
}
class division extends multiplication
{
    public void arith(double x,double y)
    {
        //dividing two numbers
        super.arith(x,y);//super keyword to extend from class Arithmetic_Overriding
        double arith4=x/y;
        System.out.println("The quotient from division of the two numbers= "+arith4);
    }
}