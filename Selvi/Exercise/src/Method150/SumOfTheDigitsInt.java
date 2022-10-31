package Method150;
import java.util.Scanner;

public class SumOfTheDigitsInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int digits = in.nextInt();
        System.out.println("The sum is Digit is: " + sumDigits(digits));
    }
    public static int sumDigits(long num) {
        int result = 0;

        while(num>0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
