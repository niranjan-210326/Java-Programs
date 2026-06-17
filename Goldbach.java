//Prog 2
import java.util.*;
public class Goldbach
{
    Scanner sc=new Scanner(System.in);
    public static boolean isPrime(int num)
    {
        int c=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        if(n<=9||n>=50)
        {
            System.out.println("Invalid. Number is out of range");
            return;
        }
        
        if (n%2!=0)
        {
            System.out.println("Invalid. Number is odd");
            return;
        }
        System.out.println("The prime pairs are: ");
        int a=3;
        int b=0;
        while(a<n/2)
        {
            b=n-a;
            if(isPrime(a)&&isPrime(b))
            {
                System.out.println(a+", "+b);
            }
            a=a+2;
        }
    }
}