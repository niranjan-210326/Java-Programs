//Prog 13
import java.util.*;
public class String_Case
{
    Scanner sc=new Scanner(System.in);
    int i,p,up=0,low=0,v=0,ch;
    String st;
    char chr;
    public void input()
    {
        System.out.println("Enter a string: ");
        st=sc.nextLine();
        p=st.length();
    }
    public void Switch()
    {
        System.out.println("Enter 1 to count uppercase characters: ");
        System.out.println("Enter 1 to count lowercase characters: ");
        System.out.println("Enter 1 to count the vowels: ");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                for(i=0;i<p;i++)
                {
                    chr=(st.charAt(i));
                    if(Character.isUpperCase(chr))
                    {
                        up=up+1;
                    }
                }
                System.out.println("The number of upper case letters is: "+up);
                break;
            case 2:
                for(i=0;i<p;i++)
                {
                    chr=(st.charAt(i));
                    if(Character.isLowerCase(chr))
                    {
                        low=low+1;
                    }
                }
                System.out.println("The number of lower case letters is: "+low);
                break;
            case 3:
                for(i=0;i<p;i++)
                {
                    chr=(st.charAt(i));
                    if((chr=='A')||(chr=='E')||(chr=='I')||(chr=='O')||(chr=='U')
                    ||(chr=='a')||(chr=='e')||(chr=='i')||(chr=='o')||(chr=='u'))
                    {
                        v=v+1;
                    }
                }
                System.out.println("The number of vowels is: "+v);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
    public static void main(String args[])
    {
        String_Case ob=new String_Case();
        ob.input();
        ob.Switch();
    }
}