package Loop150;
import java.util.Scanner;

public class SmallLargNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do{
            System.out.print("Enter the number ");
            number = s.nextInt();

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = s.next().charAt(0);
        }
        while(choice=='y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
}
}
