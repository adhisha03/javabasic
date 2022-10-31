package HW150Array;

import java.util.Arrays;

public class InsertNewArray {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,6,7,8,9,10};

        int IndexPosition = 4;
        int newValue= 5;

        System.out.println("Original Array :"+ Arrays.toString(myArray));

        for(int i=myArray.length-1; i > IndexPosition; i--){
            myArray[i] = myArray[i-1];
        }
        myArray[IndexPosition] = newValue;
        System.out.println("New Array: "+Arrays.toString(myArray));

    }
}
