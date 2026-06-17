import java.util.*;
public class Stack
{
    Scanner sc=new Scanner(System.in);
    int i,n,sp=-1,ins,del;
    int sta[]=new int[10];
    public void input()
    {
        System.out.println("Enter the total number of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            sta[i]=sc.nextInt();
        }
    }
    public void push()
    {
        System.out.println("Enter the item to be inserted: ");
        ins=sc.nextInt();
        if(sp==(n-1))
        {
            System.out.println("Stack overflows");
        }
        else
        {
            sp++;
            sta[sp]=ins;
        }
    }
    public void pop()
    {
        if(sp==-1)
        {
            System.out.println("Stack underflows");
        }
        else
        {
            del=sta[sp];
            System.out.println("The popped out element is: "+del);
            sp--;
        }
    }
    public void display()
    {
        if(sp==-1)
        {
            System.out.println("Stack full");
        }
        else
        {
            for(i=(sp-1);i>=0;i--)
            {
                System.out.println(" "+sta[i]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        Stack ob=new Stack();
        Scanner sc=new Scanner(System.in);
        ob.input();
        int ch;
        do
        {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    ob.push();
                    break;
                    
                case 2:
                    ob.pop();
                    break;
                    
                case 3:
                    ob.display();
                    break;
                    
                default:
                    System.out.println("Wrong choice");
            }
        }
        while(ch<=3);
    }
}