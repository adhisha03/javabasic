package HW150;

import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter any number:");
//        long num = s.nextLong();

        if (s.hasNextLong()) {
            long num = s.nextLong();

        if (num < 0) {
            num *= -1;
        }
        {
            int digits = 1;

            if (num >= 10 && num < 100) {
                digits = 2;
            } else if (num >= 100 && num < 1000) {
                digits = 3;
            } else if (num >= 1000 && num < 10000) {
                digits = 4;
            } else if (num >= 10000 && num < 100000) {
                digits = 5;
            }
            System.out.println("number of digits in the num:" + digits);
        }
    }
        else

    {
        System.out.println("number is not an integer");
    }
}
}

