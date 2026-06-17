import java.util.*;
public class LuckyNumber_LCM_HCF
{
    Scanner sc=new Scanner(System.in);
    int n,n1,n2,hcf,lcm,r2,numer,denom;
    public static int count=2;
    static boolean isLuckyNumber(int n) 
    {  
        if(count > n)  
        {   
            return true; 
        }
        if(n% count == 0)
        {
            return false;
        }
        //determines the position of the given number  
        n = n-(n/count);  
        count=count+1;;  
        return isLuckyNumber(n);  
    }
    public void HCF_LCM()
    {
         System.out.println("Enter two Numbers:");
         n1=sc.nextInt();
         n2=sc.nextInt();
         if (n1>n2)//checking which number is the graetest
         { 
             numer=n1;
             denom=n2;
         }
         else
         {
             numer=n2;
             denom=n1;
         }
         r2=numer%denom;//finding remainder
         while(r2!=0)
         {
            numer=denom;
            denom=r2;
            r2=numer%denom;
         }
         hcf = denom;
         lcm =(n1*n2)/hcf;//finding lcm
         System.out.println("HCF of "+n1+" and "+n2+" = "+hcf);
         System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            LuckyNumber_LCM_HCF ob=new LuckyNumber_LCM_HCF();//creating object for the class
            System.out.println("1.Lucky number");
            System.out.println("2.HCF & LCM");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
               case 1:
                   System.out.print("Enter the number: "); 
                   Scanner in=new Scanner(System.in);
                   int num;
                   num=in.nextInt();
                   //calling user-defined function   
                   if(isLuckyNumber(num))  
                   System.out.println(num+" is a Lucky Number.");  
                   else  
                   System.out.println(num+" is not a Lucky Number.");
                   break;
               
               case 2:
                   ob.HCF_LCM();
                   break;
            }
        }while(ch<=2);
    }
}