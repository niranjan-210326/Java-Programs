//prog 8
import java.util.*;
public class Tellcall
{
    Scanner sc=new Scanner(System.in);
    int n;
    double amt;
    String phno,name;
    Tellcall(String x,String y,int k)//parameterised constructor
    {
        name=x;//initialising the variables
        phno=y;
        amt=k;
    }
    public void compute()
    {
        System.out.println("Enter your name:");//getting the name as intput from the user
        name=sc.nextLine();
        System.out.println("Enter phone number");//getting the phone number as intput from the user
        phno=sc.next();
        System.out.println("Enter number of calls");//getting the number of calls from the user
        n=sc.nextInt();
        //processing bill
        if(n>=1 && n<=100)
        {
            amt=500;
        }
        else if(n>=101 && n<=200)
        {
            amt=(1.00*n)+500;
        }
        else if(n>=201 && n<=300)
        {
            amt=(1.20*n)+500;
        }
        else
        {
            amt=(1.50*n)+500;
        }
    }
    public void display()
    {
        //displaying bill
        System.out.println("Phone number"+"\t"+"\t"+"Name"+"\t"+"\t"+"Total calls"+"\t"+"\t"+"Amount");
        System.out.println(phno+"\t"+"\t"+name+"\t"+n+"\t"+"\t"+"\t"+amt);
    }
    public static void main(String args[])
    {
        Tellcall ob=new Tellcall(" "," ",0);//creating an object ; calling the parameterised variables
        ob.compute();
        ob.display();
    }
}