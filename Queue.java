//Prog 9
import java.util.*;
public class Queue
{
    Scanner sc=new Scanner (System.in);
    int queue[]=new int[10];
    int i,N,Ins,Del,f=-1,r=-1;
    public void get()
    {
        System.out.println("Enter the size of the array:");
        N=sc.nextInt();
        System.out.println("Enter the value of array:");
        for(i=0;i<N;i++)
        {
            f=0;
            r+=1;
            queue[r]=sc.nextInt();
        }
        disp();
    }
    public void insert()
    {
        if(r==9)
        {
            System.out.println("Queue Overflows.");
        }
        else
        {
            System.out.println("Enter the value to be inserted:");
            Ins=sc.nextInt();
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
            }
            else
            {
                r++;
            }
            queue[r]=Ins;
            System.out.println(Ins+" is inserted.");
        }
        disp();
    }
    public void dele()
    {
        if(r==-1&&f==-1)
        {
            System.out.println("Queue Underflows.");
        }
        else
        {
            Del=queue[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f++;
            }
            System.out.println(Del+" is deleted.");
        }
        disp();
    }
    public void full()
    {
        if(f==9)
        {
            System.out.println("Queue Overflows.");
        }
        else
        {
            System.out.println("Queue underflows.");
        }
    }
    public void empty()
    {
        if(r==-1&&f==-1)
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Queue is not empty.");
        }
    }
    public void disp()
    {
        System.out.println("The array is:");
        for(i=f;i<=r;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String args[])
    {
        Queue ob=new Queue();
        ob.get();
        ob.insert();
        ob.dele();
        ob.full();
        ob.empty();
    }
}