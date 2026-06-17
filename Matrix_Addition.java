import java.util.*;
public class Matrix_Addition
{
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][3];//Declaration of first matrix
    int b[][] = new int[3][3];//Declaration of second matrix
    int c[][] = new int[3][3];//Declaration of third matrix
    public void input()
    {
        //getting the matrix 1 elements from the user
        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        //getting the matrix 2 elements from the user
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        //Printing the first matrix
        System.out.println("The first matrix is :");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Printing the second matrix
        System.out.println("The second matrix is :");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void calculate()
    {
        //Adding the matrix elements
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                for (int k = 0; k < 3; k++) 
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
    }
    public void output()
    {
        //Printing the result matrix
        System.out.println("Matrix after addition:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_Addition ob=new Matrix_Addition();//creating an object for the class
        ob.input();
        ob.calculate();
        ob.output();
    }
}