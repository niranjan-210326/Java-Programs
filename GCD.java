import java.util.*;
public class GCD
{
    int num1,num2,f;
    Scanner sc= new Scanner (System.in);
    GCD()
    {
        num1=0;
        num2=0;
        f=0;
    }
    void accept()
    {
        System.out.println("Enter first number: ");
        num1=sc.nextInt();
        System.out.println("Enter second number: ");
        num2=sc.nextInt();
    }
    int gcd(int x,int y)
    {
        if(x==y)
        {
            return x;
        }
        else
        {
            if(x>y)
            {
                return(gcd(x-y,y));
            }
            else
            {
                return(gcd(x,y-x));
            }
        }
    }
    public void display()
    {
        f=gcd(num1,num2);
        System.out.println("Greatest Common Divisor of "+num1+" and "+num2+" is : "+f);
    }
    public static void main(String args[])
    {
        GCD obj= new GCD();
        obj.accept();
        obj.display();
    }
}