//Prog 15
import java.util.*;
public class LinearBinary_Search
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int i,N,u,first=0,mid,last=0,search;
    public void linear()
    {
        System.out.println("Enter the size of the array size:");
        N=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        search=sc.nextInt();
        for(i=0;i<N;i++)
        {
            if(a[i]==search)
            {
                first=first+1;
            }
        }
        if(first!=0)
        {
            System.out.println(search+" is present");
            System.out.println("Frequency: "+first);
        }
        else
        {
            System.out.println(search+" is not present");
        }
        first=0;
    }
    public void binary()
    {
        System.out.println("Enter the size of the array:");
        N=sc.nextInt();
        u=N-1;
        System.out.println("Enter the array elements of the array: ");
        for(i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        search=sc.nextInt();
        while(last<=u)
        {
            mid=(last+u)/2;
            if(a[mid]<search)
            {
                last=mid+1;
            }
            else if(a[mid]>search)
            {
                u=mid-1;
            }
            else
            {
                first=1;
                break;
            }
        }
        if(first==1)
        {
            System.out.println(search+" is present");
        }
        else
        {
            System.out.println(search+" is not present");
        }
        last=0;
        first=0;
    }
    public static void main(String args[])
    {
        int ch,a=0;
        Scanner sc=new Scanner(System.in);
        LinearBinary_Search ob=new LinearBinary_Search();
        do
        {
            System.out.println("1.Linear Search");
            System.out.println("2.Binary Search");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.Linear Search");
                    ob.linear();
                    a=a+1;
                    break;
                case 2:
                    System.out.println("2.Binary Search");
                    ob.binary();
                    a=a+1;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        while(ch<=2 && a<=2);
    }
}