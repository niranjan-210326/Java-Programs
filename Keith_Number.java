import java.util.*;
public class Keith_number
{
    Scanner sc=new Scanner(System.in);
    int n,n1,d,i,j,sum;
    public void input()
    {
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    public void calculate()
    {
        n1=n;
        String s=Integer.toString(n);
        d=s.length();
        int arr[]=new int[n];
        for(i=d-1;i>=0;i--)
        {
            arr[i]=n1%10;
            n1=n1/10;
        }
        i=d;
        sum=0;
        while(sum<n)
        {
            sum=0;
            for(j=1;j<=d;j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
    }
    public void output()
    {
        if(sum==n)
        {
            System.out.println("Keith Number");
        }
        else
        {
            System.out.println("Not a Keith Number");
        }
    }
    public static void main(String args[])
    {
        Keith_number ob=new Keith_number();
        ob.input();
        ob.calculate();
        ob.output();
    }
}
