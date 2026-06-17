import java.util.*;
public class Array_Manipulation
{
    Scanner sc=new Scanner(System.in);
    int i,j,k,l,o,n,temp,ins,position1,position2,search;
    int m[]=new int[50];//creating memory space in the array
    public void input()
    {
        System.out.println("Number of elements in the array:");
        //getting the number of elements in the array
        n=sc.nextInt();
        temp=n;
    }
    public void create()
    {
        System.out.println("Enter the array elements:");//inputing the array elements
        for(i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
    }
    public void insert()//inserting an array element
    {
        System.out.println("Enter the element to be inserted:");
        ins=sc.nextInt();
        System.out.println("Enter the position of insertion");
        position1=sc.nextInt();
        for(j=n-1;j>=position1;j--)
        {
            m[j+1]=m[j];
        }
        m[position1]=ins;
        n++;
        System.out.println("Array elements after insertion:");
        for(j=0;j<n;j++)
        {
            System.out.println(m[j]);
        }
        n=temp;
    }
    public void delete()//deleting an element froman array
    {
        System.out.println("Enter the position of the element to be deleted:");
        position2=sc.nextInt();
        for(k=position2+1;k<n;k++)
        {
            m[k-1]=m[k];
        }
        n--;
        System.out.println("Array elements after deletion");
        for(k=0;k<n;k++)
        {
            System.out.println(m[k]);
        }
        n=temp;
    }
    public void display()//displaying the elements of the array
    {
        System.out.println("The elements of the array are:");
        for(l=0;l<n;l++)
        {
            System.out.println(m[l]);
        }
        n=temp;
    }
    public void search()//searching for an element in an array
    {
        System.out.println("Enter the number to be searched:");
        search=sc.nextInt();//getting the number to be searched from the user
        for(o=0;o<n;o++)
        {
            if(m[o]==search)//searching for the entered number
            {
                System.out.println("The number searched is present");
                break;
            }
        }
        if(o==n)
        {
            System.out.println("The number searched is not present");
        }
        n=temp;
    }
    public static void main(String args[])
    {
        Array_Manipulation ob=new Array_Manipulation();//creating an object for the class
        Scanner sc=new Scanner(System.in);
        int ch;
        ob.input();
        do
        {
            System.out.println("1.Create an array");
            System.out.println("2.Insert an array element");
            System.out.println("3.Delete an array element");
            System.out.println("4.Display the array elements");
            System.out.println("5.Search for an array element");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                ob.create();
                break;
                
                case 2:
                ob.create();
                ob.insert();
                break;
                
                case 3:
                ob.create();
                ob.delete();
                break;
                
                case 4:
                ob.create();
                ob.display();
                break;
                
                case 5:
                ob.create();
                ob.search();
                break;
            }
        }while(ch<=5);
    }
}