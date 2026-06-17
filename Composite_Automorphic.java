import java.util.*;
public class Composite_Automorphic
{
    Scanner sc=new Scanner(System.in);
    int n,c,i,c1=0,s=1,a;
    public void Composite()
    {
        System.out.println("1.Composite number");
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=2;i<n;i++)//adding 2 to value of c if the number is not composite
        {
            if(n%i==0)
            {
                c=c+2;
            }
        }
        if(c!=1)
        {
            System.out.println(n+" "+"is a composite number");
        }
        else
        {
            System.out.println(n+" "+"is not a composite number");
        }
        c=0;
        n=0;
        i=0;
    }
    public void Automorphic()
    {
        System.out.println("2.Automorphic number");
        System.out.println("Enter a number:");
        n=sc.nextInt();
        s=n*n;//squaring the number
        int temp=n;
        while(temp>0)
        {
            c1=c1+1;
            temp=temp/10;
        }
        a= (int) (s%(Math.pow(10,c1)));
        if(n == a)//checking if n is equal to a
        {
            System.out.println("It is an Automorphic number");
        }
        else
        {
            System.out.println("It is not an Automorphic number");
        }
        s=1;
        n=0;
        a=0;
        temp=0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            Composite_Automorphic ob=new Composite_Automorphic();//creating an object for the class
            System.out.println("1.Composite number");
            System.out.println("2.Automorphic number");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)//invoking the methods of the class using the object created
            {
               case 1:
               ob.Composite();
               break;
               
               case 2:
               ob.Automorphic();
               break;
            }
        }while(ch<=2);//while condition in do-while loop
    }
}