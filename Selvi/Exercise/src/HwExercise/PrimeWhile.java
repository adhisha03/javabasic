package HwExercise;

public class PrimeWhile {
    public static void main(String[] args) {

        int PrimeCheckNum;
        int n=1;
        int divisibleCount;

        while (n<=500){
            divisibleCount=0;
            PrimeCheckNum=2;

            while (PrimeCheckNum<=n/2){
                if(n%PrimeCheckNum==0) {
                    divisibleCount++;
                    break;
                }
                PrimeCheckNum++;
                }
            if (divisibleCount==0 && n!=1){
                System.out.println(n+" ");
            }
            n++;

        }
    }
}
