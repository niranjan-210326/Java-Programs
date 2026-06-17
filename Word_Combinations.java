import java.util.*;
public class Word_Combinations
{
    Scanner sc=new Scanner(System.in);
    int i,l,j,k;
    String st;
    char c;
    public void input()
    {
        System.out.println("Enter a 3 letter word:");
        st=sc.nextLine();
    }
    public void process()
    {
        System.out.println("The possible combinations are:");
        l=st.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(i!=j&&j!=k&&k!=i)
                    {
                        System.out.println(st.charAt(i)+""+st.charAt(j)+""+st.charAt(k));
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        Word_Combinations obj=new Word_Combinations();
        obj.input();
        obj.process();
    }
}