package HwExercise;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the day");
        String day= s.nextLine();

        switch (day){
            case"Monday":
                System.out.println(1);
                break;

            case"Tuesday":
                System.out.println(2);
                break;

            case"wednesday":
                System.out.println(3);
                break;

            case "thursday":
                System.out.println(4);
                break;

            case"friday":
                System.out.println(5);
                break;
        }
    }
}
