//Prog 3
import java.util.*;
public class Binary_Decimal_Conversion
{
    int a,c=0,d;
    String st=" ";
    public int BinaryToDecimal(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            a=n%10;
            d=d+(a*(int)Math.pow(2,c));
            c=c+1;
            BinaryToDecimal(n/10);
        }
        return d;
    }
    public int DecimalToBinary(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            a=n%2;
            st=Integer.toString(a)+st;
            DecimalToBinary(n/2);
        }
        n=Integer.valueOf(st);
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,n;
        Binary_Decimal_Conversion ob=new Binary_Decimal_Conversion();
        do
        {
            System.out.println("1.Binary to Decimal");
            System.out.println("2.Decimal to Binary");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.Binary to Decimal");
                    System.out.println("Enter a Binary number: ");
                    n=sc.nextInt();
                    System.out.println(ob.BinaryToDecimal(n));
                    break;
                case 2:
                    System.out.println("2.Decimal to Binary");
                    System.out.println("Enter a Decimal number: ");
                    n=sc.nextInt();
                    System.out.println(ob.DecimalToBinary(n));
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }while(ch<4);
    }
}