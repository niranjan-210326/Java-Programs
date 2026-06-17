//Prog 23
import java.util.*;
public class Matrix_Rotate
{
    int m,i,j,s=0;
    int a[][]=new int[m][m];
    Scanner sc=new Scanner(System.in);
    public void Rotate()
    {
        System.out.println("Enter the number of rows and columns in the matrix: ");
        m=sc.nextInt();
        if(m>2 && m<10)
        {
            System.out.println("Enter the matrix elements: ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original matrix: ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Matrix after rotation: ");
            for(i=0;i<m;i++)
            {
                for(j=(m-1);j>=0;j--)
                {
                    if((i==0 && j==0) || (i==0 && j==(m-1)) || (i==(m-1) && j==0) || (i==(m-1) && j==(m-1)))
                    {
                            s=s+a[i][j];
                    }
                    System.out.print(a[j][i]+"\t");
                }
                System.out.println();
            }
            System.out.println("Sum of the corner elements=" +s);
        }
        else
        {
            System.out.println("Size out of range");
        }
    }
    public static void main(String args[])
    {
        Matrix_Rotate ob=new Matrix_Rotate();
        ob.Rotate();
    }
}