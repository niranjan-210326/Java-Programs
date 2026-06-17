//Prog 13
import java.util.*;
public class String_Contents
{
    Scanner sc= new Scanner(System.in);
    String str;
    char ch;
    int n,i,u=0,l=0,v=0;
    public void input()
    {
        System.out.println("Enter a String");
        str=sc.nextLine();
    }
    public void process()
    {
        n=str.length();
        for(i=0;i<n;i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                u=u+1;
            }
            if(Character.isLowerCase(ch))
            {
                l=l+1;
            }
            ch=Character.toUpperCase(ch);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                v=v+1;
            }
        }
    }
    public void output1()
    {
        System.out.println("Number of upper case characters : "+u);
    }
    public void output2()
    {
        System.out.println("Number of lower case characters : "+l);
    }
    public void output3()
    {
        System.out.println("Number of vowels : "+v);
    }
    public static void main (String args[])
    {
        String_Contents ob= new String_Contents();
        Scanner sc=new Scanner(System.in);
        int ch;
        ob.input();
        ob.process();
        do
        {
            System.out.println("1.To count the upper case charcaters: ");
            System.out.println("2.To count the lower case characters: ");
            System.out.println("3.To count the number of vowels: ");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.To count the upper case charcaters: ");
                    ob.output1();
                    break;
                case 2:
                    System.out.println("2.To count the lower case characters: ");
                    ob.output2();
                    break;
                case 3:
                    System.out.println("3.To count the number of vowels: ");
                    ob.output3();
                    break;
                default:
                    System.out.println("Wrong choice!!");
            }
        }while(ch<5);
    }
}