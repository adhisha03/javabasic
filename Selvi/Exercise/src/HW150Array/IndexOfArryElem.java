package HW150Array;

public class IndexOfArryElem {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int element = 0;
        int number;
        while (element < numbers.length) {
            number = numbers[element];

            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i] && i > element) {
                    System.out.println(number + i);
                    break;
                }
                element++;
            }
            System.out.println(element);
        }

    }    }
