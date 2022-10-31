package HW150;

public class RemoveHtmlTagsStr {
    public static void main(String args[]){
        String text = "<p>I don't want this p tag<\\p>";
        System.out.println(text);
        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
    }
}
