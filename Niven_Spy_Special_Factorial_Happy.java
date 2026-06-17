 //Prog 6
import java.util.*;
public class Niven_Spy_Special_Factorial_Happy
{
    public int Niven(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return((n%10)+Niven(n/10));
        }
    }
    public int Spy(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            System.out.println(n);
            return((n%10)*Spy(n/10));
        }
    }
    public int Special(int n1)
    {
        if(n1==0)
        {
            return 0;
        }
        else
        {
            return(Factorial(n1%10)+Special(n1/10));
        }
    }
    public int Factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return(n*Factorial(n-1));
        }
    }
    public int Happy(int n)
    {
        int a;
        if(n==0)
        {
            return 0;
        }
        else
        {
            a=n%10;
            return((a*a)+Happy(n/10));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,ch,num;
        Niven_Spy_Special_Factorial_Happy ob= new Niven_Spy_Special_Factorial_Happy();
        do
        {
            System.out.println("1.Niven Number");
            System.out.println("2.Spy Number");
            System.out.println("3.Special Number");
            System.out.println("4.Happy Number");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.Niven Number");
                    System.out.println("Enter a number: ");
                    num=sc.nextInt();
                    a=ob.Niven(num);
                    if(num%a==0)
                    {
                        System.out.println("It is a Niven Number");
                    }
                    else
                    {
                        System.out.println("It is not a Niven Number");
                    }
                    break;
                case 2:
                    System.out.println("2.Spy Number");
                    System.out.println("Enter a number: ");
                    num=sc.nextInt();
                    a=ob.Niven(num);
                    b=ob.Spy(num);
                    if(a==b)
                    {
                        System.out.println("It is a Spy Number");
                    }
                    else
                    {
                        System.out.println("It is not a Spy Number");
                    }
                    break;
                case 3:
                    System.out.println("3.Special Number");
                    System.out.println("Enter a number: ");
                    num=sc.nextInt();
                    c=ob.Special(num);
                    if(num==c)
                    {
                        System.out.println("It is a Special Number");
                    }
                    else
                    {
                        System.out.println("It is not a Special Number");
                    }
                    break;
                case 4:
                    System.out.println("4.Happy Number");
                    System.out.println("Enter a number: ");
                    num=sc.nextInt();
                    do
                    {
                        d=ob.Happy(num);
                        num=d;
                    }
                    while(d>9);
                    if(d==1)
                    {
                        System.out.println("It is a Happy Number");
                    }
                    else
                    {
                        System.out.println("It is not a Happy Number");
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                }
        }while(ch<5);
    }
}