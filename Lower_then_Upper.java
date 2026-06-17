import java.util.*;
public class Lower_then_Upper
{
    Scanner sc = new Scanner(System.in);
    int i;
    char a;
    //initialising the string variables
    String s1="";
    String s2="";
    String s3="";
    public void input()
    {
        System.out.println("Enter the string=");//inputing the string from the user
        s1=sc.nextLine();
    }
    public void process()
    {
        for(i=0; i<s1.length(); i++)
        {
            a=s1.charAt(i);
            if(Character.isUpperCase(a)==true)
            //checking whether there are upper case characters in the string
            {
                s2=s2+a;
            }
            if(Character.isLowerCase(a)==true)
            //checking whether there are lower case characters in the string
            {
                s3=s3+a;
            }
        }
    }
    public void output()
    {
        System.out.println("Lower case after upper case="+s3+" "+s2);
        //printing the lower and then upper case characters of the string
    }
    public static void main(String args[])
    {
        Lower_then_Upper ob=new Lower_then_Upper();//creating an object for the class
        ob.input();
        ob.process();
        ob.output();
    }
}