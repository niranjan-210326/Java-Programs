//Pro 18
import java.util.*;
public class Matrix_Mirror
{
    int A[][]=new int[20][20];
    int B[][]=new int[20][20];
    Scanner sc=new Scanner(System.in);
    int M,i,j,a;
    public void input()
    {
        System.out.println("Enter the number of rows and columns: ");
        M=sc.nextInt();
        if(M>20 || M<2)
        {
            System.exit(0);
        }
        System.out.println("Enter the elements of array: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void mirror()
    {
        for(i=0;i<M;i++)
        {
            a=M-1;
            for(j=0;j<M;j++)
            {
                B[i][j]=A[i][a];
                a--;
            }
        }
        System.out.println("Mirror Matrix Image:");
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Matrix_Mirror ob=new Matrix_Mirror();
        ob.input();
        ob.mirror();
    }
}