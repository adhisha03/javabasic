package HwExercise;

public class IndexOfNum {
    public static void main(String[] args) {
        int[] ages = {1, 5, 2, 5, 4, 5, 6, 7, 9, 8};
        int l= ages.length;
        System.out.println("integer array length is:"+l);

        for (int i=0;i< ages.length;i++) {
            if (ages[i] == 5) {
                System.out.println("index position of num %5:" + i);
            }
        }
    }
}







