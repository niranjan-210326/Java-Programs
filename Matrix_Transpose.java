import java.util.*;
public class Matrix_Transpose
{
    Scanner sc=new Scanner(System.in);
    int i,j;
    //allocating memory space in the arrays
    int num[][]=new int[3][3];
    int num1[][]=new int[3][3];
    public void input()
    {
        System.out.println("Enter the elements of the matrix:");//getting the elements of the matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the matrix are:");//Printing the elements of the matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void calculate()
    {
        //finding the transpose of the matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                num1[j][i]=num[i][j];
            }
        }
    }
    public void output()
    {
        System.out.println("The transpose of the matrix:");//printing the transpose of the matri
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(num1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_Transpose ob=new Matrix_Transpose();//creating an object for the class
        ob.input();
        ob.calculate();
        ob.output();
    }
}