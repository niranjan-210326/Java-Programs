import java.util.*;
public class Token
{
    Scanner sc=new Scanner(System.in);
    int p,q,i,j;
    char ch,ch1;
    String st1=" ",st2=" ",st3=" ";
    public void input()
    {
        System.out.println("Enter a word: ");
        st1=sc.next();
    }
    public void process()
    {
        p=st1.length();
        if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')
        ||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        continue;
        st2=st2+ch;
    }
    public void output()
    {
        System.out.println("The new token formed after deleting the vowels is: "+st2);
        q=st2.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<q;j++)
            {
                ch1=st2.charAt(j);
                if((ch1==(char)i)||(ch1==(char)(i+32)))
                {
                    st3=st3+ch1;
                }
            }
        }
        System.out.println("The new token after arranging in ascending order is: "+st3);
    }
    public static void main(String args[])
    {
        Token ob=new Token();
        ob.input();
        ob.process();
        ob.output();
    }
}