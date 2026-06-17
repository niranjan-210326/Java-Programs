import java.util.*;
public class EqMat
{
    Scanner sc=new Scanner(System.in);
    int a[][],m,n,i,j;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    public void readarray()
    {
        System.out.println("Enter the matrix elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    int check(EqMat P,EqMat Q)
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    public void print()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        EqMat A=new EqMat(m,n);
        EqMat B=new EqMat(m,n);
        A.readarray();
        System.out.println("The first matrix is: ");
        A.print();
        B.readarray();
        System.out.println("The second matrix is: ");
        B.print();
        if(A.check(A,B)==1)
        {
            System.out.println("It is an equal matrix");
        }
        else
        {
            System.out.println("It is not an equal matrix");
        }
    }
}