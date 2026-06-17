import java.util.*;
public class Amrstrong_Adam_Largest_Sign
{
    int n,temp=0,c=0,d,n1,n2,n3,s,rev,rev1,d1;
    Scanner sc=new Scanner(System.in);
    public void Armstrong()
    {
        System.out.println("1.Armstrong number");
        System.out.println("Enter a number:");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            d=n%10;
            c=c+(d*d*d);//adding the cube of each digit
            n=n/10;
        }
        if(temp==c)
        {
            System.out.println(temp+" "+"is an armstrong number");
        }
        else
        {
            System.out.println(temp+" "+"is not an armstrong number");
        }
        n=0;
        temp=0;
        c=0;
    }
    public void Adam()
    {
        System.out.println("2.Adam number");
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=n;i>0;i=i/10)//reversing the digits of the number
          {
            d=n%10;
            rev= rev*10+d;
          }
        s=n*n;//squaring the number
        for (int i=s;i>0;i=i/10)
          {
            d1=n%10;
            rev1=(rev1*10)+d1;
          } 
        rev=rev*rev;//squaring the reversed number
        if(rev==rev1)
        {
            System.out.println("It is an Adam number");
        }
        else
        {
            System.out.println("It is not an Adam Number"); 
        }
        n=0;
        i=0;
        rev=0;
        rev1=0;
    }
    public void Biggest()
    {
        System.out.println("3.Biggest among three numbers using nested if");
        System.out.println("Enter the three numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n1 > n2)//outer if 
        {
             if (n1 > n3)//inner if
             {
                 System.out.print("Largest is:" + n1);
             } 
             else
             {
                 System.out.print("Largest is:" + n3);
             }
        } 
        else 
        {
             if (n2 > n3)//inner if
             {
                 System.out.print("Largest is:" + n2);
             }
             else 
             {
                 System.out.print("Largest is:" + n3);
             }
        }
    }
    public void Ternary()
    {
        System.out.println("4.Positive, negative or zero using ternary operator");
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.println((n>0)?" It is a Positive number":(n<0)?"It is a Negative number":"The number"
        +"is Zero");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            Amrstrong_Adam_Largest_Sign ob=new Amrstrong_Adam_Largest_Sign();//creating an object for the class
            System.out.println("1.Armstrong number");
            System.out.println("2.Adam number");
            System.out.println("3.Biggest among three numbers using nested if");
            System.out.println("4.Positive, negative or zero using ternary operator");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)//invoking the methods of the class
            {
               case 1:
               ob.Armstrong();
               break;
               
               case 2:
               ob.Adam();
               break;
               
               case 3:
               ob.Biggest();
               break;
               
               case 4:
               ob.Ternary();
               break;
            }
        }while(ch<=4);
    }
}