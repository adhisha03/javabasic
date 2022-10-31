package HwExercise;

public class ReverseOrderString {
    public static void main(String[] args) {
        String string = "black horse went to jogging";
        String reversed = " ";
        String[] temp = string.split(" ");
       // System.out.println(temp.length);

        for (int i = temp.length - 1; i >=0; i--){
            reversed = reversed + temp[i] + " ";
    }
        System.out.println(reversed);
    }
}


