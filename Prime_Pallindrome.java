//prog 4
import java.util.*;
public class Prime_Pallindrome
{
    Scanner sc=new Scanner(System.in);
    int d,i,j,k=0,r=0,n,p=0,m;
    public void input()
    {
        System.out.println("Enter the value of m:");
        m=sc.nextInt();//getting the lower limit from the user
        System.out.println("Enter the value of n:");
        n=sc.nextInt();//getting the upper limit from the user
    }
    public void print()
    {
        System.out.println("Prime pallindrome numbers between "+m+" and "+n+" are:");
        for(i=m;i<=n;i++)
        {
            //initialising the values of m,r and p
            m=i;
            r=0;
            p=i;
            do
            {
                d=m%10;
                r=(r*10)+d;//reversing the digits of the number
                m=m/10;
            }
            while(m!=0);
            if(r==p)//checking if the reversed number is equal to the original number
            {
                //checking whether the found pallindrome numbers are prime or not
                for(j=1;j<=p;j++)
                {
                    if(p%j==0)
                    {
                        k=k+1;
                    }
                }
                if(k==2)
                {
                    System.out.print(p+" ");//printing the pallindrome numbers which are prime
                }
                k=0;
                d=0;
                r=0;
                p=0;
            }
        }
    }
    public static void main(String args[])
    {
        Prime_Pallindrome ob=new Prime_Pallindrome();//creating object for the class and invoking method
        ob.input();
        ob.print();
    }
}