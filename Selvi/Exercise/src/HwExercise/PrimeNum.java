package HwExercise;

public class PrimeNum {
    public static void main(String[] args) {
        int count;
        System.out.println("the 500 prime numbers are:");
        for (int j =2; j<=500; j++) {
            count = 0;

            for (int i=1;i<=j;i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(j);
                }

        }
    }
}
