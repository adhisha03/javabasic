package HW150Array;

import java.util.Arrays;

import java.util.Scanner;

public class AscndOrderOfArray {
    public static void main(String[] args) {
        int num, temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        num = s.nextInt();

        int a[] = new int[num];
        System.out.println("Enter all the elements:");

        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }

            for (int i = 0; i < num; i++)
                for (int j = i + 1; j < num; j++)

                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }

            System.out.println("ascending order:");
            for (int i = 0; i < num - 1; i++) {
                System.out.println(a[i]);
            }
                System.out.println(a[num - 1]);
            }
        }


