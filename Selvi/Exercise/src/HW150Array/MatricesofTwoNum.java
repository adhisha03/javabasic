package HW150Array;

import java.util.Scanner;

public class MatricesofTwoNum {
    public static void main(String[] args) {
        int a,b,c,d;

        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows matrices:");
        a=s.nextInt();

        System.out.println("enter number of colum matrices:");
        b=s.nextInt();

        int number1[][]=new int[a][b];
        int number2[][]=new int[a][b];
        int sum[][]=new int[a][b];

        System.out.println("enter the first element of matrices:");
        for (c=0;c<a;c++){
            for (d=0;d<b;d++) {
                number1[c][d] = s.nextInt();
            }
        }
        System.out.println("enter the second element of matrix:");
        for (c=0;c<a;c++) {
            for (d = 0; d < b; d++) {
                number2[c][d] = s.nextInt();
            }
        }
        System.out.println("enter the sum of matrix:");
        for (c=0;c<a;c++){
            for (d=0;d<b;d++) {
                sum[c][d]=number1[c][d]+number2[c][d];
            }
                }
        for (c=0;c<a;c++){
            for (d=0;d<b;d++) {
                System.out.println(sum[c][d]+"\t");

            }
        }

    }
}
