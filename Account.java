import java.util.*;
class Bank
{
    Scanner sc=new Scanner(System.in);
    String name;
    long accno;
    double p;
    Bank(String Name,long Accno,double P)
    {
        name=Name;
        accno=Accno;
        p=P;
    }
    void display()
    {
        System.out.println("Customer's name: "+name);
        System.out.println("Account number: "+accno);
        System.out.println("Principal amount: "+p);
    }
}
public class Account extends Bank
{
    double amt;
    Account(String Name,long Accno,double P,double Amt)
    {
        super(Name,Accno,P);
        amt=Amt;
    }
    void deposit()
    {
        p=p+amt;
    }
    void withdraw()
    {
        if(amt>p)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            p=p-amt;
        }
        if(p<500)
        {
            p=p-(500-p)/10;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Amount after depositing: "+p);
        System.out.println("Amount after withdrawing: "+p);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String N;
        long acc;
        double Principal,amount;
        System.out.println("Enter the name of the customer: ");
        N=sc.next();
        System.out.println("Enter the account number of the customer: ");
        acc=sc.nextLong();
        System.out.println("Enter the Principal amount in the account: ");
        Principal=sc.nextDouble();
        System.out.println("Enter the deposit/withdrawal amount: ");
        amount=sc.nextDouble();
        Account ob=new Account(N,acc,Principal,amount);
        ob.deposit();
        ob.withdraw();
        ob.display();
    }
}