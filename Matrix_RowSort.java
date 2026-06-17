//Prog 16
import java.util.*;
public class Matrix_RowSort
{
    Scanner sc= new Scanner (System.in);
    int A[][]=new int[10][10];
    int B[][]=new int[10][10];
    int i,j,k,M,N,min,temp;
    public void input()
    {
        System.out.println("Enter the number of rows of the matrix: ");
        M=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix: ");
        N=sc.nextInt();
        System.out.println("Enter the matrix elements: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public void arrange()
    {
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                for(k=1;k<(N-j);k++)
                {
                    if (A[i][k-1]>A[i][k])
                    {
                        temp=A[i][k-1];
                        A[i][k-1]=A[i][k];
                        A[i][k]=temp;
                    }
                }
            }
        }
        System.out.println("Matrix after sorting Rows: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_RowSort ob=new Matrix_RowSort();
        ob.input();
        ob.arrange();
    }
}