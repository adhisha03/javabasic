package HwExercise;

import java.util.Scanner;
        public class Ex2 {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                System.out.println("enter the value of A:");
                int A = s.nextInt();

                System.out.println("enter the value of B:");
                int B = s.nextInt();

                System.out.println("enter the value of c:");
                int C = s.nextInt();

                if (A>B && A>C) {
                    System.out.println("A is greater than B and C ");
                }
                else if (B>A && B>C) {
                    System.out.println("B is greater than A and C");

                }
                else if (C < B && C < A) {
                    System.out.println("C is lesser than A and B");
                }
                else {
                    System.out.println("C is biggest number");

                }

            }
        }
