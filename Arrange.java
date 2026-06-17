//Prog 14
import java.util.*;
public class Arrange
{
    int i,l;
    char ch;
    String st,st1="",st2="",st3="";
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter the string: ");
        st=sc.nextLine();
    }
    public void check()
    {
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(Character.isUpperCase(ch))
            {
                st1+=ch;
            }
            else if(Character.isLowerCase(ch))
            {
                st2+=ch;
            }
            else
            {
                st3+=ch;
            }
        }
        System.out.println(st2+" "+st1);
    }
    public static void main(String args[])
    {
        Arrange ob= new Arrange();
        ob.input();
        ob.check();
    }
}