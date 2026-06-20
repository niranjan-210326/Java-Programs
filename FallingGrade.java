import java.util.Scanner;
public class FallingGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int failedCount=0;
        for (int i=0;i<n;i++) {
            int score=sc.nextInt();
            if(score<p) {
                failedCount++;
            }
        }
        System.out.println(failedCount);
    }
}