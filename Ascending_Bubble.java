import java.util.*;
public class Ascending_Bubble
{
    Scanner sc=new Scanner(System.in);
    int i,j,n,temp;
    int num[]=new int[100];//creating an array and determining its limit
    public void input()
    {
        System.out.println("Enter the number of array elements");
        n=sc.nextInt();//inputing the number of array elements from the user
        System.out.println("Enter the elements of the array");
        for(i=0;i<n;i++)
        {
            num[i]=sc.nextInt();//getting the elements of the array from the user
        }
    }
    public void calculate()
    {
        //calculating the least array element and arranging the array elements accordingly
        for(i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(num[j-1]>num[j])
                {
                    temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                }
            }
        }
    }
    public void output()
    {
        System.out.println("The numbers in ascending order:");
        for(i=0;i<n;i++)
        {
            System.out.println(num[i]);//displaying the array elements in ascending order
        }
    }
    public static void main(String args[])
    {
        Ascending_Bubble ob=new Ascending_Bubble();//creating object for the class
        ob.input();
        ob.calculate();
        ob.output();
    }
}