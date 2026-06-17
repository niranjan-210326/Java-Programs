//Prog 27
import java.util.*;
public class Vowels_StartEnd
{
    Scanner sc= new Scanner(System.in);
    String st,st1,st2="",st3="";
    int l,l1,count=0,i;
    char ch,ch1,ch2,ch3;
    public void input()
    {
        System.out.println("Enter a string: "); 
        st=sc.nextLine();
        st=st.toUpperCase();
        l=st.length();
        ch2=st.charAt(l-1);
        if(ch2 !='.' && ch2 !='?' && ch2 !='!')
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        st=st.replace(".","");
        st=st.replace("?","");
        st=st.replace("!","");
    }
    public void process()
    {
        StringTokenizer str=new StringTokenizer(st);
        while(str.hasMoreTokens())
        {
            st1=str.nextToken();
            l1=st1.length();
            ch=st1.charAt(0);
            ch1=st1.charAt(l1-1);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
                st2=st2+st1+" ";
            }
            else
            {
                st3=st3+st1+" ";
            }
        }
        System.out.println("Number of words Beginning and Ending with Vowel : "+count);
        System.out.println(st2+st3);
    }
    public static void main(String args[])
    {
        Vowels_StartEnd ob= new Vowels_StartEnd();
        ob.input();
        ob.process();
    }
}