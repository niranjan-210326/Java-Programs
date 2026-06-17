import java.util.*;
public class Magic_Perfect
{
    int n,n1,s,p,q,d,i,sum=0;
    Scanner sc=new Scanner(System.in);
    public void Magic()
    {
        System.out.println("1.Magic number");
        System.out.println("Enter a number:");
        n=sc.nextInt();//getting the number to be checked from the user
        s=n;//temporarily storing the value of n in s
        while(s>9)
        {
            n=s;
            s=0;
            while(n>0)
            {
                d=n/10;//separating the digits of the number
                p=d*10;
                q=n-p;
                s=s+q;
                n=d;
            }
        }
        if(s==1)//checking if the digits of the number add up to 1
        {
            System.out.println("It is a magic number");
        }
        else
        {
            System.out.println("It is not a magic number");
        }
    }
    public void Perfect()
    {
        System.out.println("Enter a number:");
        n1=sc.nextInt();
        for(i=1;i<=(n1/2);i++)//checking if a number is perfect number or not
        {
            if(n1%i==0)//finding the sum of the factors of the number
            {
                sum=sum+i;
            }
        }
        if(sum==n1)//checking whether the sum of the factors of the number is equal to it
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
        //reinitialising the variables
        i=1;
        n1=0;
        sum=0;
    }
    public static void main(String args[])
    {
        Magic_Perfect ob=new Magic_Perfect();//object created for class
        int ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1.Magic number");
            System.out.println("2.Perfect number");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                //invoking methods through objects
                case 1:
                ob.Magic();
                break;
                
                case 2:
                ob.Perfect();
                break;
            }
        }while(ch<=2);
    }
}