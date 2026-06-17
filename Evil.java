//Prog 33
import java.util.*;
public class Evil
{
    int n,a,c=0;
    String st="";
    public void decimalToBinary(int n)
    {
        while(n!=0)
        {
            a=n%2;
            if(a==1)
            {
                c++;
            }
            st=Integer.toString(a)+st;
            n=n/2;
        }
        System.out.println("Binary value ="+ st);
        a=0;
        st="";
    }
    public void display()
    {
        System.out.println("Binary Equivalent : "+st);
        System.out.println("Number of 1's : "+c);
        if(c%2==0)
        {
            System.out.println("Evil Number");
        }
        System.out.println("Not an Evil Number");
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int num;
        System.out.println("Enter a decimal number");
        num=sc.nextInt();
        Evil obj =new Evil();
        obj.decimalToBinary(num);
        obj.display();
    }
}