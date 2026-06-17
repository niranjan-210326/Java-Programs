//Prog 25
import java.util.*;
public class Circular_Prime
{
    Scanner sc=new Scanner(System.in);
    int n,a,temp=0,c=0;
    String s,p;
    public void input()
    {
        System.out.println("Enter the number: ");
        n=sc.nextInt();
    }
    public boolean check(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
            return true;
        else
            return false;
    }
    public int rotate_digits(int n) 
    {
        s=Integer.toString(n);
        p=s.substring(1)+s.charAt(0);
        int a=Integer.parseInt(p);
        return a;
    }
    public static void main(String args[])
    {
        Circular_Prime ob = new Circular_Prime();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int a=n,temp=0;
        do
        {
            System.out.println(a);
            if(ob.check(a)==false)
            {
                temp=1;
                break;
            }
            a = ob.rotate_digits(a);
        }
        while(a!=n);
        if(temp==1)
        {
            System.out.println(n+" "+"is not a circular prime number");
        }
        else
        {
            System.out.println(n+" "+"is a circular prime number");
        }
    }
}