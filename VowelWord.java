//Prog 5,33
import java.util.Scanner;
import java.util.*;
public class VowelWord
{
    Scanner sc=new Scanner(System.in);
    String str;
    char ch,ch1;
    int freq,i,l;
    public VowelWord()
    {
        str="";
        ch1=' ';
        freq=0;
    }
    public void readstr()
    {
        System.out.println("Enter a string: ");
        str=sc.nextLine();
    }
    public void count()
    {
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(i==0)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    freq++;
                }
            }
            else if(ch==' ')
            {
                ch1=str.charAt(i+1);
                if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
                {
                    freq++;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Original String: "+str);
        System.out.println("Frequency of the words beginning with a vowel: "+freq);
    }
    public static void main()
    {
        VowelWord ob=new VowelWord();
        ob.readstr();
        ob.count();
        ob.display();
    }
}