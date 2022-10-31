package HW150;

import java.util.Arrays;

public class OccuranceAndIndexes {
    public static void main(String[] args) {
        int n = 10;
        int element = 5;
        int array[] = {1, 5, 2, 5, 4, 5, 6, 7, 9, 8};
        int occurance = 0;

        for (int i = 0; i < n; i++) {
            if (element == array[i]) {
                occurance++;
            }
        }
        System.out.println(element+" "+"Occured"+" " +occurance+" "+"times");
    }
}








