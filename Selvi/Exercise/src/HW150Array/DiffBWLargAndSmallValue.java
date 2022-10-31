package HW150Array;

import java.util.Arrays;

public class DiffBWLargAndSmallValue {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 36, 98, 23, 32};
        System.out.println("original array:" + Arrays.toString(numbers));
        int maximumVal = numbers[0];
        int minimumVal = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximumVal) {
                maximumVal = numbers[i];
            } else if (numbers[i] < minimumVal) {
                minimumVal = numbers[i];
            }
        }
        System.out.println("difference between largest number to smallest number:" + (maximumVal - minimumVal));
    }
}

