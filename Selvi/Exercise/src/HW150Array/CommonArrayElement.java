package HW150Array;

import java.util.Arrays;

public class CommonArrayElement {
    public static void main(String[] args) {

        int []number1={1,7,2,4,9,6,3,5};
        int[]number2={2,3,10,20,30,7,5};

        System.out.println("the number1 array values:"+ Arrays.toString(number1));
        System.out.println("the number2 array values:" +Arrays.toString(number2));

        for (int i=0;i<number1.length;i++){

            for (int j=0;j<number2.length;j++){
                if (number1[i]==number2[j]){
                    System.out.println("common element:"+number1[i]);
                }
            }
        }

    }
}
