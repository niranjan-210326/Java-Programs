import java.util.*;
public class Series
{
    int n,n1,n2,i,j,k,l,f,a,S1=0,S2=0;
    double S=1.0;//initialising S as double as it involves division
    Scanner sc=new Scanner(System.in);
    public void Series1()
    {
        System.out.println("1. 1+ (1/2!) + (1/3!) +....+ (1/n!)");
        System.out.println("Enter the limit:");//getting the limit from the user
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            S=(double)(S+(float)1/f);//explicit type conversions
        }
        System.out.println("The sum of the series is "+ S);
        //reinitialising the variables
        n=0;
        i=0;
        j=0;
        f=1;
        S=0.0;
    }
    public void Series2()
    {
        System.out.println("2. 2+5+10+.....+n1");
        System.out.println("Enter the limit:");
        n1=sc.nextInt();
        for(k=1;k<=n1;k++)
        {
            S1=S1+((k*k)+1);
        }
        System.out.println("The sum of series="+S1);//Printing the sum of the series
        n1=0;
        k=0;
        S1=0;
    }
    public void Series3()
    {
        System.out.println("3. 1+(a^2)+(a^3)+(a^4)+.....+(a^n2)");
        System.out.println("Enter the limit:");
        n2=sc.nextInt();
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        for(l=2;l<=n2;l++)
        {
            S2=S2+(int)(Math.pow(a,l));
        }
        System.out.println("The sum of the series is = "+S2);
    }
    public static void main(String args[])
    {
        Series ob=new Series();//creating object for the class
        int ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1. 1+ (1/2!) + (1/3!) +....+ (1/n!)");
            System.out.println("2. 2+5+10+.....+n");
            System.out.println("3. 1+(a^2)+(a^3)+(a^4)+.....+(a^n)");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();//getting the choice variable from the user
            switch(ch)
            {
                //invoking methods with the help of the created objects
                case 1:
                ob.Series1();
                break;
                
                case 2:
                ob.Series2();
                break;
                
                case 3:
                ob.Series3();
                break;
            }
        }while(ch<=3);
    }
}