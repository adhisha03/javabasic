package HW150Array;

import java.util.Scanner;

public class TranceposeMatrix {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the row :");
        int row=s.nextInt();

        System.out.println("enter the column:");
        int column=s.nextInt();

        int array[][]=new int[row][column];
        System.out.println("enter the matrix:");

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++) {
                array[i][j] = s.nextInt();
                System.out.println();
            }
        }
        System.out.println("before transpose the matrix:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("after transpose the matrix:");
        for (int i=0;i<column;i++){
            for (int j=0;j<row;j++) {
                System.out.println(array[i][j]);

            }
        }
    }
}
