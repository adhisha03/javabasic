package HwExercise;
import java.util.Scanner;

public class DayofTheDate {
    public static void main(String[] args) {
        int day=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the date:");
         int date= scan.nextInt();
         date=date%7;

        switch (date){

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 0:
                System.out.println("sunday");
                break;

        }

    }
}
