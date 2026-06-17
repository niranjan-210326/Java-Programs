//Prog 10
import java.util.*;
public class Delete_Vowels
{
    Scanner sc= new Scanner(System.in);
    String st,st1="",st2="";
    int i,j,l;
    char ch;
    public void input()
    {
        System.out.println("Enter a word: ");
        st=sc.next();
    }
    public void delete()
    {
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!='a' &&
            ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                st1=st1+ch;
            }
        }
    }
    public void display()
    {
        l=st1.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<l;j++)
            {
                ch=st1.charAt(j);
                if(ch==(char)i||ch==(char)(i+32))
                {
                    st2=st2+ch;
                }
            }
        }
        System.out.println("The word after deleting the vowels is : "+st1);
        System.out.println("The word after arranging the letters in ascending order is : "+st2);
    }
    public static void main(String args[])
    {
        Delete_Vowels ob= new Delete_Vowels();
        ob.input();
        ob.delete();
        ob.display();
    }
}