package HW150;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the units:");
        int unit = s.nextInt();

        if (unit <= 100) {
            int amount = unit * 5;
            System.out.println("bill amount" + amount);
        }

        else if (unit >= 101 && unit <= 200) {
            int amount = 100 * 5 + (unit - 100) * 7;
            System.out.println("bill amount:" + amount);
        }

         else if (unit >= 201 && unit <= 300) {
            int amount = 100 * 5 + 200 * 7 + (unit - 200) * 10;
            System.out.println("bill amount:" + amount);
        }

         else {
            int amount = 100 * 5 + 200 * 7 + (unit - 200) * 10 + (unit - 300) * 15;
            System.out.println("bill amount:" + amount);
        }
    }
}


