package HwExercise;

public class Ex5While {
    public static void main(String[] args) {
        int num=500;
        int i=0;

        while (i<=num){
            if(i%2==0 && i%6==0 && i%8==0){
                System.out.println(i);
            }
            i++;
        }


    }
}
