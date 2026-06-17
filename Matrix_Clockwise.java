//Prog 23
import java.util.*;
public class Matrix_Clockwise
{
    int A[][]=new int [10][10];
    int B[][]=new int [10][10];
    int M,i,j,k=0,sum=0;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter the size of the matrix: ");
        M=sc.nextInt();
        if(M>20 || M<2)
        {
            System.exit(0);
        }
        System.out.println("Enter the elements of the matrix: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }
    public void turn()
    {
        k=M-1;
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                B[j][k]=A[i][j];
            }
            k--;
        }
        sum=A[0][0] + A[M-1][0] + A[0][M-1] + A[M-1][M-1];
    }
    public void display()
    {
        System.out.println("Input Matrix: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix turned clockwise: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The sum of the corner elements is= "+sum);
    }
    public static void main(String args[])
    {
        Matrix_Clockwise ob= new Matrix_Clockwise();
        ob.input();
        ob.turn();
        ob.display();
    }
}