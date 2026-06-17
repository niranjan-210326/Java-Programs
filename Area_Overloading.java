//Prog 31
import java.util.*;
class Area_Overloading
{
    void area(float a)
    {
        System.out.println("Area of the square= "+(a*a)+" sq units");
    }
    void area(float a,float b)
    {
        System.out.println("Area of the rectangle= "+(a*b)+" sq units");
    }
    void area(double r)
    {
        System.out.println("Area of the circle= "+(3.14*r*r)+" sq units");
    }
    public static void main(String args[])
    {
        Area_Overloading ob=new Area_Overloading();
        Scanner sc=new Scanner(System.in);
        float x,y1,y2;
        double z;
        System.out.println("Enter side of square:");
        x=sc.nextFloat();
        System.out.println("Enter the length and breadth of the rectangle:");
        y1=sc.nextFloat();
        y2=sc.nextFloat();
        System.out.println("Enter the radius of the circle:");
        z=sc.nextDouble();
        ob.area(x);
        ob.area(y1,y2);
        ob.area(z);
    }
}