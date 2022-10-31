package Method150;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        System.out.println("selvi is an angel="+ words("Selvi is an ANGEL"));
    }
    public static  int words(String str) {
        int count = 0;
        if (!(("".equals(str.substring(0, 1))) || (str.equals(str.substring(str.length() - 1))))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
}