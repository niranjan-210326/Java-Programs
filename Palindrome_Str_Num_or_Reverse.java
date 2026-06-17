//Prog 12
import java.util.*;
public class Palindrome_Str_Num_or_Reverse
{
    int d,n1=0;
    public int Reverse(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            d=(n%10);
            n1=(n1*10)+d;
            Reverse(n/10);
        }
        return(n1);
    }
    public int Palindrome(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            d=n%10;
            n1=(n1*10)+d;
            Palindrome(n/10);
        }
        return(n1);
    }
    public static void main(String args[])
    {
        int n,n1,ch;
        String st,st1;
        Scanner sc=new Scanner(System.in);
        Palindrome_Str_Num_or_Reverse ob= new Palindrome_Str_Num_or_Reverse();
        do
        {
            System.out.println("1. Palindrome or Not (String): ");
            System.out.println("2. Palindrome or Not (Number): ");
            System.out.println("3. Reverse a Number: ");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1. Palindrome or Not (String) ");
                    System.out.println("Enter a String: ");
                    st=sc.next();
                    StringBuffer str= new StringBuffer(st);
                    str.reverse();
                    st1=str.toString();
                    if(st.equalsIgnoreCase(st1))
                    {
                        System.out.println("It is a Palindrome String");
                    }
                    else
                    {
                        System.out.println("It is not a Palindrome String");
                    }
                    break;
                case 2:
                    System.out.println("2. Palindrome or Not (Number): ");
                    System.out.println("Enter a number: ");
                    n=sc.nextInt();
                    n1=ob.Palindrome(n);
                    if(n1==n)
                    {
                        System.out.println("It is a Pallindrome Number");
                    }
                    else
                    {
                        System.out.println("It is not a Pallindrome Number");
                    }
                    break;
                case 3:
                    System.out.println("3. Reverse a Number: ");
                    System.out.println("Enter a number: ");
                    n=sc.nextInt();
                    System.out.println("The reversed number is: ");
                    System.out.println(ob.Reverse(n));
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }while(ch<5);
    }
}