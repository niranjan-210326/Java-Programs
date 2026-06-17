//Prog 24
import java.util.*;
public class Prime_Adam
{
    Scanner sc= new Scanner(System.in);
    int m,n,count=0,f=0,d=0,i,j,p,r,x,y;
    public void input()
    {
        System.out.println("Enter the lower limit: ");
        m=sc.nextInt();
        System.out.println("Enter the upper limit: ");
        n=sc.nextInt();
    }
    public int Prime(int num)
    {
        count=0;
        for(j=1;j<num;j++)
        {
            if(num%j==0)
            {
                count++;
            }
        }
        return count;
    }
    public int Reverse(int n1)
    {
        if(n1==0)
        {
            return 0;
        }
        else
        {
            d=(d*10)+(n1%10);
            Reverse(n1/10);
        }
        return d;
    }
    public int Adam(int n2)
    {
        p=(n2*n2);
        r=Reverse(p);
        d=0;
        p=(int)Math.sqrt(r);
        r=Reverse(p);
        d=0;
        return r;
    }
    public void check()
    {
        for(i=m;i<=n;i++)
        {
            x=Prime(i);
            y=Adam(i);
            if((x==1)&&(y==i))
            {
                System.out.println(i);
                f++;
            }
        }
        System.out.println("The frequency of the prime adam integers is: "+f);
    }
    public static void main(String args[])
    {
        Prime_Adam ob =new Prime_Adam();
        ob.input();
        ob.check();
    }
}