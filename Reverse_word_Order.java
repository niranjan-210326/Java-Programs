import java.util.*;
public class Reverse_word_Order
{
    Scanner sc=new Scanner(System.in);
    int i,j;
    char ch;
    String s1;
    //initialising the string variables
    String s2=" ";
    String s3=" ";
    public void input()
    {
        System.out.println("Enter a string:");//inputing a string from the user
        s1=sc.nextLine();
    }
    public void process()
    {
        s1=s1+" ";
        //rearranging the string
        for(i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            {
                s3=s2+" "+s3;
                s2=" ";
            }
            else
            {
                s2=s2+ch;
            }
        }
    }
    public void print()
    {
        System.out.println("The reversed string= "+s3);//printing the string in reverse order
    }
    public static void main(String args[])//main method
    {
        Reverse_word_Order ob=new Reverse_word_Order();//creating an object for the class
        ob.input();
        ob.process();
        ob.print();
    }
}