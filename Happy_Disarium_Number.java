import java.util.*;
public class Happy_Disarium_Number
{
    int n,sum1=0,d1,temp,num,sum2,d2,l;
    Scanner sc=new Scanner(System.in);
    public void Happy()
    {
        System.out.println("1.Happy number");
        System.out.println("Enter the number:");
        n=sc.nextInt();//getting the number ot be checked from the user
        sum1=n;//temporarily storing the value of n in sum1
        do
        {
           n=sum1;
           sum1=0;
           do
           {
               d1=n%10;
               sum1=sum1+(d1*d1);/*separating the digits of the number, then squaring the digits and
               adding them*/
               n=n/10;
           }while(n>0);
        }while(sum1>9);
        if(sum1==1)//checking whether the above sum is equal to the number
        {
            System.out.println("It is a happy number");
        }
        else
        {
            System.out.println("It is not a happy number");
        }
        //reinitialising the variables
        n=0;
        sum1=0;
        d1=0;
    }
    public void Disarium()
    {
        System.out.println("2.Disarium number");
        System.out.println("Enter a number:");
        num=sc.nextInt();
        temp=num;
        d2=0;
        sum2=0;
        String s=Integer.toString(num);//converting the entered number to a string
        int l=s.length();//finding the length of the string
        while(temp>0)
        {
            d2=temp%10;
            sum2=sum2+(int)Math.pow(d2,l);/*separating the digits of the number and finding powers of
            them with respect to their positions and adding them*/
            l=l-1;
            temp=temp/10;
        }
        if(sum2==num)//checking if the above sum is equal to the entered number
        {
            System.out.println("It is a Disarium number");
        }
        else
        {
            System.out.println("It is not a disarium number");
        }
        //reinitialising the variables
        num=0;
        temp=0;
        d2=0;
        sum2=0;
    }
    public static void main(String args[])
    {
        Happy_Disarium_Number ob=new Happy_Disarium_Number();//creating object for the class
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("1.Happy number");
            System.out.println("2.Disarium number");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                //invoking the methods through objects
             case 1:
                ob.Happy();
                break;
                
             case 2:
                ob.Disarium();
                break;
            }
        }while(ch<=2);
   }
}