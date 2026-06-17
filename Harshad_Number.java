import java.util.*;
public class Harshad_number
{
    Scanner sc=new Scanner(System.in);
    int n,d,sum=0;
    public void get()
    {
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    public void process()
    {
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
    }
    public void display()
    {
        if(n%sum==0)
        {
            System.out.println(n+" "+"is a Harshad number");
        }
        else
        {
            System.out.println(n+" "+"is not a Harshad number");
        }
    }
    public static void main(String args[])
    {
        Harshad_number ob=new Harshad_number();
        ob.get();
        ob.process();
        ob.display();
    }
}
