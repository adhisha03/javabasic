package Method150;

public class VowelsCount {
    public static void main(String[] args) {

        System.out.println("the vowels counts are:"+vowels("pichaiSelvi obsessed Udhaya"));

    }
    public static int vowels(String vowel) {
    int count = 0;
    for (int i = 0; i < vowel.length(); i++) {
        if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' ||
                vowel.charAt(i) == 'o' || vowel.charAt(i) == 'u') {
            count++;

        }
    }
    return count;
}
}