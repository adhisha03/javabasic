package Loop150;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int firstTerm=0;
        int secondTerm=1;
        int thirdTerm;


        System.out.print("enter the number of series:");
        int number=s.nextInt();

        System.out.print(firstTerm+" "+secondTerm+" ");

        for (int i=3;i<=number;i++){
            thirdTerm=firstTerm+secondTerm;
            System.out.print(thirdTerm+" ");

            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
}
