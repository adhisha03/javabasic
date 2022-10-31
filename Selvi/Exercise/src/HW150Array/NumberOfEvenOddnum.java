package HW150Array;

import java.util.Arrays;

public class NumberOfEvenOddnum {
    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6};
        System.out.println("original array:"+ Arrays.toString(numbers));
        int count=0;
        for (int i=0;i< numbers.length;i++) {
            if (numbers[i] % 2 == 0) {

                count++;
            }
        }
            System.out.println("number of even numbers:"+count);
            System.out.println("number of odd numbers:"+(numbers.length-count));

    }
}
