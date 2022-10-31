package HW150;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int number=0,sum=0;
        double average;
       System.out.println("enter the 5 numbers:");

            for(int i=0;i<5;i++){
            Scanner s=new Scanner(System.in);
            number=s.nextInt();

            sum+=number;

        }
        average=sum/5;
        System.out.println("the sum of five number is:"+sum+" "+"and the avrg is:"+average);
    }
}
