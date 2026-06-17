import java.util.*;
public class Composite_Matrix
{
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[20][20];
    int m,n,i,j,a=2,x;
    Composite_Matrix(int mm,int nn)
    {
        n=nn;
        m=mm;
    }
    int isComposite(int p)
    {
        if(p==a)
        {
            return 0;
        }
        else
        {
            if(a%p++==0)
            {
                return 1;
            }
            else
            {
                return(isComposite(p));
            }
        }
    }
    public void fill()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                x=0;
                while(x<1)
                {
                    if(isComposite(2)==1)
                    {
                        arr[j][i]=a;
                        x++;
                    }
                    a++;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("The Composite Matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main (String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,m1;
        System.out.println("Enter Number of rows:");
        m1=sc.nextInt();
        System.out.println("Enter Number of columns:");
        n1=sc.nextInt();
        Composite_Matrix obj=new Composite_Matrix(m1,n1);
        obj.fill();
        obj.display();
    }
}