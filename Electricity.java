import java.util.*;
public class Electricity
{
    Scanner sc=new Scanner(System.in);
    long num;
    float units;
    double amt;
    String name=" ";
    public void input()
    {
        System.out.println("Enter the customer's name:");
        name=sc.nextLine();//getting the name of the customer from the user
        System.out.println("Enter customer's number:");
        num=sc.nextLong();//getting the customer's phone number from the user
        System.out.println("Enter the units consumed");
        units=sc.nextFloat();//getting the units of current consumed
    }
    public void process()//processing a money receipt for the current usage
    {
        if(units<=100)
        {
            amt=5.50*units;
            System.out.println("Money receipt:");
            System.out.println("Consumer Number:"+num);
            System.out.println("Consumer's Name:"+name);
            System.out.println("Units Consumed:"+units);
            System.out.println("Amount to be paid:"+amt);
        }
        if(units>100 && units<=300)
        {
            amt=6.50*units;
            System.out.println("Money receipt:");
            System.out.println("Consumer Number:"+num);
            System.out.println("Consumer's Name:"+name);
            System.out.println("Units Consumed:"+units);
            System.out.println("Amount to be paid:"+amt);
        }
        if(units>300 && units<=600)
        {
            amt=7.50*units;
            System.out.println("Money receipt:");
            System.out.println("Consumer Number:"+num);
            System.out.println("Consumer's Name:"+name);
            System.out.println("Units Consumed:"+units);
            System.out.println("Amount to be paid:"+amt);
        }
        if(units>600)
        {
            amt=8.50*units;
            System.out.println("Money receipt:");
            System.out.println("Consumer Number:"+num);
            System.out.println("Consumer's Name:"+name);
            System.out.println("Units Consumed:"+units);
            System.out.println("Amount to be paid:"+amt);
        }
    }
    public static void main(String args[])
    {
        Electricity ob=new Electricity();//creating an object for the class
        ob.input();
        ob.process();
    }
}