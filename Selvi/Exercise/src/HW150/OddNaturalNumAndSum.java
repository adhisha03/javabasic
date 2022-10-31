package HW150;

import java.util.Scanner;

public class OddNaturalNumAndSum {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter number of terms:");

        Scanner s=new Scanner(System.in);

        int num=s.nextInt();
        System.out.println("the numbers are:");

        for (int i=1;i<=num;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
        System.out.println("the sum of odd natural Natural num UpTo:"+num+"terms is:"+sum);


    }
}
