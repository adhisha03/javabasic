package Method150;
import java.util.Scanner;

public class YearLeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        System.out.println(checkLeapYear(year));
    }
    public static boolean checkLeapYear(int year) {
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        return a && (b || c);
    }
}
