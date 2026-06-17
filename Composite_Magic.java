import java.util.*;
public class Composite_Magic
{
    Scanner sc=new Scanner(System.in);
    int m,n,i,j,count=0,sum=0,d,num,x;
    public void input()
    {
        System.out.println("Enter the lower limit: ");
        m=sc.nextInt();
        System.out.println("Enter the upper limit: ");
        n=sc.nextInt();
    }
    public void check()
    {
        if(m<1 || n<1 || m>n)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    public void process()
    {
        for(i=m;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                x=0;
                if(i%j==0)
                {
                    x=1;
                    break;
                }
            }
            if(x==1 && i!=1)
            {
                sum=0;
                num=i;
                while(num>9)
                {
                    while(num!=0)
                    {
                        d=num%10;
                        sum=sum+d;
                        num=num/10;
                    }
                    num=sum;
                }
                if(num==1)
                {
                    count++;
                    System.out.println(i+" ");
                }
            }
        }
    }
    public void frequency()
    {
        System.out.println("Frequency: "+count);
    }
    public static void main(String args[])
    {
        
    }
}