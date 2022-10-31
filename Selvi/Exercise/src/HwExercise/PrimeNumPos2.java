package HwExercise;

public class PrimeNumPos2 {
    public static void main(String[] args) {
        int i;
        int position = 5;
        int num = 1;
        int count = 0;
        while (count < position) {
            num = num + 1;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        System.out.println(num);

    }
}