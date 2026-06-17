import java.util.*;	
public class Smith_number
{
    Scanner sc=new Scanner(System.in);
    int n,m,i=2,temp,sum1=0,sum2=0,d;
    public void input()
    {
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    public void calculate()
    {
        m=n;
        while(n>1)
        {
            if(n%i==0)
            {
                temp=i;
                while(temp!=0)
                {
                    d=temp%10;
                    sum1=sum1+d;
                    temp=temp/10;
                }
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        temp=m;
        while(temp!=0)
        {
            d=temp%10;
            sum2=sum2+d;
            temp=temp/10;
        }
    }
    public void output()
    {
        if(sum1==sum2)
        {
            System.out.println("It is a Smith number");
        }
        else
        {
            System.out.println("It is not a Smith number");
        }
    }
    public static void main(String args[])
    {
        Smith_number ob=new Smith_number();
        ob.input();
        ob.calculate();
        ob.output();
    }
}