package HwExercise;

public class Exer5 {
    public static void main(String[] args) {
        int num = 500;
        System.out.println("divided the numbers by 2,6,8:");

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0 && i%6==0 && i%8==0) {
                System.out.println(i);
            }
        }
    }
}

