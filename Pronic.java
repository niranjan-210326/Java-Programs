import java.util.*;
public class Pronic
{
    Scanner sc=new Scanner(System.in);
    int num,n,i,nn,c=0,p;
    Pronic()
    {
        num=0;
        n=0;
    }
    public void acceptnum()
    {
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    public void isPronic()
    {
        nn=num;
        for(i=0;i<=num;i++)
        {
            p=i*(i+1);
            if(p==nn)
            {
                c++;
                break;
            }
        }
    }
    public boolean isPronic(int v)
    {
        if(v>num)
        {
            return false;
        }
        else
        {
            n=v*(v+1);
            if(n==num)
            {
                return true;
            }
            return isPronic(++v);
        }
    }
    public void output()
    {
        if(isPronic(0)==true)
        {
            System.out.println("It is a pronic number");
        }
        else
        {
            System.out.println("It is not a pronic number");
        }
    }
    public static void main(String args[])
    {
        Pronic obj=new Pronic();
        obj.acceptnum();
        obj.output();
    }
}