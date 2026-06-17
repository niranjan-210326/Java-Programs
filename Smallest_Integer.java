//Prog 22
import java.util.*;
public class Smallest_Integer
{
    int n,m,i,s=0,sum,d;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter a number greater than 100 and less than 10000(m): ");
        m=sc.nextInt();
        if(m>10000 || m<100)
        {
            System.out.println("Check the validity of input(input should be greater than 100 but less than 1000)");
            System.exit(0);
        }
        System.out.println("Enter a number less than 100(n)");
        n=sc.nextInt();
        if(n>100)
        {
            System.out.println("The number is greater than 100");
            System.exit(0);
        }
    }
    public void process()
    {
        for(i=m;i<10000;i++)
        {
            sum=Sum(i);
            if(sum==n)
            {
                System.out.println("The required number : "+i);
                System.out.println("Total no. of digits : "+d);
                System.exit(0);
            }
        }
        System.out.println("Invalid input");
    }
    public int Sum(int num)
    {
        s=0;
        d=0;
        while(num>0)
        {
            s=s+(num%10);
            d=d+1;
            num=num/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Smallest_Integer ob = new Smallest_Integer();
        ob.input();
        ob.process();
    }
}