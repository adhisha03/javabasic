package HW150Array;

import java.util.Arrays;

public class SecondLowNum {
    public static void main(String[] args){
        int[] number = {1, 3, 5, 77, 88, 67, 33, 55, 99};
        System.out.println(Arrays.toString(number));
        int min=Integer.MAX_VALUE;
        int SecondMin=Integer.MAX_VALUE;

        for (int i=0;i<number.length;i++){
            if (number[i]==min){
                SecondMin=min;
            } else if (number[i]<min) {
                SecondMin=min;
                min=number[i];
            }
            else if(number[i]<SecondMin){
                SecondMin=number[i];
            }
        }
            System.out.println(SecondMin);
        }
}

