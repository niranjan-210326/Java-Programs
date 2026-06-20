import java.util.Scanner;
public class FourDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%04d\n", n);
    }
}