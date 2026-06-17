//Prog 21
import java.util.*;
public class Symmetric_Matrix
{
    Scanner sc=new Scanner(System.in);
    int a[][],s1=0,s2=0,m,i,j,f=1;
    public void input()
    {
        System.out.println("Enter the value of m: ");
        m=sc.nextInt();
        if(m>=10)
        {
            System.out.println("Matrix size is out of range");
            System.exit(0);
        }
        else
        {
            a=new int[m][m];
            System.out.println("Enter the array elements: ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
        }
    }
    public void process()
    {
        System.out.println("Original matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                {
                    s1=s1+a[i][j];
                }
                if((i+j)==(m-1))
                {
                    s2=s2+a[i][j];
                }
                if(a[i][j]!=a[j][i])
                {
                    f=0;
                }
            }
        }
    }
    public void output()
    {
        if(f==1)
        {
            System.out.println("The given matrix is a symmetric matrix");
        }
        else
        {
            System.out.println("The given matrix is not a symmetric matrix");
        }
        System.out.println("The sum of the left diagonal ="+s1);
        System.out.println("The sum of the right diagonal ="+s2);
    }
    public static void main(String args[])
    {
        Symmetric_Matrix ob=new Symmetric_Matrix();
        ob.input();
        ob.process();
        ob.output();
    }
}