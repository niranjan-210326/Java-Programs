import java.util.*;
public class Matrix_Sort
{
    Scanner sc=new Scanner(System.in);
    int i,j,k,temp,m,n;
    int arr[][]=new int[m][n];
    public void input()
    {
        System.out.println("Enter the number of rows and columns in the matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
    }
    public void sort()
    {
        if((m<=2 && m>=20) || (n<=2 && n>=20))
        {
            System.out.println("The matrix size is out of range");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter the matrix elements: ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original matrix:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<(n-1);j++)
                {
                    for(k=0;k<(n-1-j);k++)
                    {
                        if(arr[i][k] > arr[i][k+1])
                        {
                            temp=arr[i][k];
                            arr[i][k]=arr[i][k+1];
                            arr[i][k+1]=temp;
                        }
                    }
                }
            }
        }
    }
    public void output()
    {
        System.out.println("The matrix after sorting the rows is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_Sort ob=new Matrix_Sort();
        ob.input();
        ob.sort();
        ob.output();
    }
}