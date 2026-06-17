import java.util.*;

public class Magic_Num {
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public int checkMagic(int n) {
        if (n < 10) {
            return n;
        }
        return checkMagic(sumDigits(n));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Magic_Num ob = new Magic_Num();

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (ob.checkMagic(num) == 1) {
            System.out.println(num + " is a magic number");
        } else {
            System.out.println(num + " is not a magic number");
        }
    }
}