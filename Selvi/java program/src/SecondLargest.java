import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 77, 88, 67, 33, 55, 99};
        Arrays.sort(number);
      //  System.out.println(Arrays.toString(number));
        System.out.println(number[number.length - 3]);

    }
    }

