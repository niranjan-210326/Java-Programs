import java.util.*;
public class Binary_Search
{
    Scanner sc=new Scanner(System.in);
    int n,i,ub,search=0,k=0,lb=0,p=0;//initialisition of the variables
    int m[]=new int[50];//creating an array and allocating memory space in it
    public void input()
    {
        System.out.println("The number of elements of the array:");
        //getting the number of array elements from the user
        n=sc.nextInt();
        ub=n-1;
        System.out.println("The elements of the array are:");//getting the array elements from the user
        for(i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        search=sc.nextInt();//getting the element to be searched from the user
    }
    public void calculate()//searching for the asked element in the array
    {
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<search)
            {
                lb=p+1;
            }
            else if(m[p]>search)
            {
                ub=ub-1;
            }
            else
            {
                k=1;
                break;
            }
        }
    }
    public void output()
    {
        if(k==1)//printing whether the searched element is present or not
        {
            System.out.println("The element searched for is present");
        }
        else
        {
            System.out.println("The element searched for is not present");
        }
    }
    public static void main(String args[])
    {
        Binary_Search ob=new Binary_Search();//creating an object for the class
        ob.input();
        ob.calculate();
        ob.output();
    }
}