package HwExercise;

public class SumOfDividedNum {
    public static void main(String[] args) {
        int number = 300;
        int i = 200;
        int sum1 = 0;
        while (i <= number) {
            if (i % 4 == 0 && i % 6 == 0 && i % 8 == 0) {
                sum1 = sum1 + i;
               System.out.println("the sum1 numbers:" + sum1);
            }
            i++;
        }
            int number1 = 800;
            int j = 400;
            int sum2 = 0;
            while (j <= number1) {
               if (j % 25 == 0  && j % 45 == 0) {
                    sum2 = sum2 + j;
                    System.out.println("the sum2 numbers:" + sum2);
                }
                j++;
            }

            int sum = sum1 + sum2;
            System.out.println("total number of sum:" + sum);
        }
    }

