import java.util.*;
public class Matrix_Sum_Of_Elements
{
    int i,j,sum=0;
    Scanner sc=new Scanner(System.in);
    int m[][]=new int[3][3];
    public void process()
    {
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                m[i][j]=sc.nextInt();
                sum=sum + m[i][j];
            }
        }
        System.out.println("Elements of the matrix are:");//Printing the elements of the matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void output()
    {
        System.out.println("Sum of elements of the matrix="+sum);
    }
    public static void main(String args[])
    {
        Matrix_Sum_Of_Elements ob=new Matrix_Sum_Of_Elements();
        ob.process();
        ob.output();
    }
}