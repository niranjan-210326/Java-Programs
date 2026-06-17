//Prog 32
import java.util.*;
public class Addition
{
    public int sum(int x,int y)
    {
        int sum1=x+y;
        return(sum1);
    }
    public int sum(int x,int y,int z)
    {
        int sum2=x+y+z;
        return(sum2);
    }
    public double sum(double x1,double x2)
    {
        double sum3=x1+x2;
        return(sum3);
    }
    public float sum(float x1,float x2,float x3)
    {
        float sum4=x1+x2+x3;
        return(sum4);
    }
    public static void main(String args[])
    {
        Addition ob=new Addition();
        Scanner sc=new Scanner(System.in);
        int a,b,e,f,g,h,i;
        double c,m,n;
        float d,j,k,l;
        System.out.println("Enter the two integers to be added:");
        e=sc.nextInt();
        f=sc.nextInt();
        System.out.println("Enter the three integers to be added:");
        g=sc.nextInt();
        h=sc.nextInt();
        i=sc.nextInt();
        System.out.println("Enter the two double numbers to be added:");
        m=sc.nextDouble();
        n=sc.nextDouble();
        System.out.println("Three float numbers to be added:");
        j=sc.nextFloat();
        k=sc.nextFloat();
        l=sc.nextFloat();
        a=ob.sum(e,f);
        b=ob.sum(g,h,i);
        c=ob.sum(m,n);
        d=ob.sum(j,k,l);
        System.out.println("Sum of 2 integers= "+a);
        System.out.println("Sum of 3 integers= "+b);
        System.out.println("Sum of 2 double numbers= "+c);
        System.out.println("Sum of 3 float numbers= "+d);
    }
}