import java.util.*;
public class Mixer
{
    Scanner sc= new Scanner(System.in);
    int n,i,j;
    int arr[];
    Mixer(int nm)
    {
        n=nm;
        arr=new int[n];
    }
    public void accept()
    {
        System.out.println("Enter the elements of both the arrays in ascending order: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A)
    {
        Mixer t=new Mixer(n+A.n);
        for(i=0;i<A.n;i++)
        {
            t.arr[i]=A.arr[i];
        }
        for(j=0;j<n;j++)
        {
            t.arr[A.n+j]=arr[j];
        }
        return(t);
    }
    public void display()
    {
        System.out.println("The merged elements are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+"\t");
        }
    }
    public static void main(String args[])
    {
        Mixer ob1= new Mixer(3);
        Mixer ob2= new Mixer(4);
        Mixer ob3=new Mixer(7);
        ob1.accept();
        ob2.accept();
        ob3=ob2.mix(ob1);
        ob3.display();
    }
}