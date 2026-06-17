import java.util.*;
public class First_to_Upper
{
    Scanner sc=new Scanner(System.in);
    int i;
    String s1;
    String s2=" ";//initialising string variable
    char ch1,ch2;
    public void input()
    {
        System.out.println("Enter a string:");//getting a string from the user
        s1=sc.nextLine();
    }
    public void process()
    {
        s1=' '+s1;
        for(i=0;i<s1.length();i++)
        {
            ch1=s1.charAt(i);
            if(ch1==' ')
            {
                ch2=s1.charAt(i+1);
                s2=s2+' '+Character.toUpperCase(ch2);//changing first letter to upper case
                i=i+1;
            }
            else
            {
                s2=s2+ch1;
            }
        }
    }
    public void print()
    {
        //displaying the modified string
        System.out.println("The new string after changing the first letters to upper case="+s2);
    }
    public static void main(String args[])//main method
    {
        First_to_Upper ob=new First_to_Upper();//creating an object for the class
        ob.input();
        ob.process();
        ob.print();
    }
}