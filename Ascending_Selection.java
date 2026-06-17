//Prog 11
import java.util.*;
public class Ascending_Selection
{
    Scanner sc=new Scanner(System.in);
    int i,j,temp,small,n;
    int num[]=new int[100];//creating an array and allocating its memory space
    public void input()
    {
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();//inputing the size of the array from the user
        System.out.println("Enter the array elements");//getting the array elements from the user
        for(i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
    }
    public void calculate()
    {
        for(i=0;i<(n-1);i++)//calculating the least value and arranging it in ascending order
        {
            small=i;
            for(j=i+1;j<n;j++)
            {
                if(num[j]<num[small])
                {
                    small=j;
                }
            }
            temp=num[i];
            num[i]=num[small];
            num[small]=temp;
        }
    }
    public void display()
    {
        System.out.println("The numbers after arranged in ascending order:");
        for(i=0;i<n;i++)
        {
            System.out.println(num[i]);//displaying the arranged array elements
        }
    }
    public static void main(String args[])
    {
        Ascending_Selection ob=new Ascending_Selection();//object is created for the class
        ob.input();
        ob.calculate();
        ob.display();
    }
}