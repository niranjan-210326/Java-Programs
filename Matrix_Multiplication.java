//Prog 17
import java.util.*;
public class Matrix_Multiplication
{
    Scanner sc =new Scanner(System.in);
    int i,j,k;
    int A[][] =new int[3][3];
    int B[][] =new int[3][3];
    int C[][] =new int[3][3];
    public void input()
    {
        System.out.println("Enter elements of Matrix A: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
    }
    public void multiply()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
                }
            }
        }
    }
    public void display()
    {
        System.out.println("Input Matrix A: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Input Matrix B: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Output Matrix C: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_Multiplication ob=new Matrix_Multiplication();
        ob.input();
        ob.multiply();
        ob.display();
    }
}