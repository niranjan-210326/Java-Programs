//Prog 11
import java.util.*;
public class Selection_Sort
{
    Scanner sc=new Scanner(System.in);
    int n,i,j,temp,min;
    int arr[]=new int[50];
    public void input()
    {
        System.out.println("Enter number of elements in the array: ");
        n=sc.nextInt();
        System.out.println("Enter the array elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void sort()
    {
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=(i+1);j<n;j++)
            {
                if (arr[min]>arr[j])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public void display()
    {
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[])
    {
        Selection_Sort ob=new Selection_Sort();
        ob.input();
        ob.sort();
        ob.display();
    }
}