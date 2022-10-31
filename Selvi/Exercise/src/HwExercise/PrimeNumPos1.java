package HwExercise;

import java.util.Scanner;

public class PrimeNumPos1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the primeNumber:");
            int primeNum = sc.nextInt();
            int position = 7;
            int[] arrayPrime = new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19};

            for(int i = 0; i < arrayPrime.length; ++i) {
                if (primeNum == arrayPrime[i]) {
                    if (position == i) {
                        System.out.println("the prime number position is true ");
                    } else {
                        System.out.println("the prime number position is false");
                    }
                }
            }

        }
    }

