package HW150Array;

public class SpecificValueOfArray {
    public static boolean contains(int[] array1, int item) {
        for (int num : array1) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(my_array1, 5));
        System.out.println(contains(my_array1, 50));
    }

}
