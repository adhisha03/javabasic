package Method150;
import  java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = console.nextInt();

        if(isEven(num)) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
