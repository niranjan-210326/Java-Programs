import java.util.*;
public class Special
{
    Scanner sc=new Scanner(System.in);
    int n,f,s,nn;
    Special()
    {
        f=0;
        nn=0;
        s=0;
    }
    public void read()
    {
        System.out.println("Enter the number:");
        n=sc.nextInt();
    }
    int factorial(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return(x*factorial(x-1));
        }
    }
    boolean isSpecial()
    {
        nn=n;
        while(n>0)
        {
            f=factorial(n%10);
            s=s+f;
            n=n/10;
        }
        if(s==nn)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void display()
    {
        if(isSpecial())
        {
            System.out.println("Special Number.");
        }
        else
        {
            System.out.println("Not a Special Number.");
        }
    }
    public static void main(String aegs[])
    {
        Special obj=new Special();
        obj.read();
        obj.display();
    }
}