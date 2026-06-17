//Prog 30
import java.util.*;
class Detail
{
    String Name,Address,Telno;
    int Rent;
    Detail(String n,String a,String t,int r)
    {
        Name=n;
        Address=a;
        Telno=t;
        Rent=r;
    }
    void show()
    {
        System.out.println("Name of the customer: "+Name);
        System.out.println("Address of the customer: "+Address);
        System.out.println("Telephone no. of the customer: "+Telno);
    }
}
public class Bill extends Detail
{
    int N,Amt;
    Bill(String na,String ad,String te,int re,int num)
    {
        super(na,ad,te,re);
        N=num;
    }
    void call()
    {
        if(N<=100)
        {
            Amt=Rent;
        }
        else if(N>100 && N<=200)
        {
            Amt=N+Rent;
        }
        else if(N>200 && N<=300)
        {
            Amt=(N*2)+Rent;
        }
        else
        {
            Amt=(N*3)+Rent;
        }
    }
    void show()
    {
        super.show();
        System.out.println("Amount to be paid : "+Amt);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name,address,telno;
        int n,rent;
        System.out.println("Enter the customer's name : ");
        name=sc.nextLine();
        System.out.println("Enter the customer's address : ");
        address=sc.nextLine();
        System.out.println("Enter the custmer's telephone no. : ");
        telno=sc.nextLine();
        System.out.println("Enter the no. of calls made by the customer : ");
        n=sc.nextInt();
        System.out.println("Enter the rent: ");
        rent=sc.nextInt();
        Bill obj= new Bill(name,address,telno,rent,n);
        obj.call();
        obj.show();
    }
}