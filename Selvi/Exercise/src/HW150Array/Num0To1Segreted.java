package HW150Array;

import java.util.Arrays;

public record Num0To1Segreted() {
    public static void main(String[] args) {
        int[]number={1,0,0,1,0,0,1,0,1,1,0};

        int size= number.length;
        int right= size-1;
        int left=0;
        System.out.println("original array:"+ Arrays.toString(number));

        while (left<right){

           while (number[left]==0 && left<right)
               left++;

               while(number[right]==1 && left<right)
                   right--;

                   if (left < right) {
                       number[left] = 0;
                       number[right] = 1;
                       left++;
                       right--;
                   }
               }
                   System.out.println(" after segregation:"+Arrays.toString(number));
           }
           }

