//Prog 19
import java.util.*;
public class Pallindrome_Word
{
    Scanner sc=new Scanner(System.in);
    String st,st1,st2,st3="";
    int l,count;
    char ch;
    public void input()
    {
        System.out.println("Enter a string: "); 
        st=sc.nextLine();
        l=st.length();
        st=st.toUpperCase();
        ch=st.charAt(l-1);
        if(ch!='.' && ch!='?' && ch!='!')
        {
            System.out.println("The sentence is not terminated by a punctuation mark");
            System.exit(0);
        }
        st=st.replace(".","");
        st=st.replace("?","");
        st=st.replace("!","");
    }
    public void process()
    {
        StringTokenizer str= new StringTokenizer(st);
        while(str.hasMoreTokens())
        {
            st1=str.nextToken();
            StringBuffer st4= new StringBuffer(st1);
            st4.reverse();
            st2=st4.toString();
            if(st1.equals(st2))
            {
                count++;
                st3=st3+st1+" ";
            }
        }
    }
    public void display()
    {
        System.out.println("Total number of Pallindrome words= "+count);
        System.out.println("The palindeome words in the sentence are: "+st3);
    }
    public static void main(String args[])
    {
        Pallindrome_Word ob= new Pallindrome_Word();
        ob.input();
        ob.process();
        ob.display();
    }
}