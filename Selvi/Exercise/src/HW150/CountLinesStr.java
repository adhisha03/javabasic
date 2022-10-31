package HW150;

public class CountLinesStr {
    public static int LineCount(String text){
        return text.split("[\n|\r]").length;
    }

    public static void main(String a[]){
        String str = "line1\nline2\nline3\nline4\rline5";
        int count = LineCount(str);
        System.out.println("Total Line count: "+count);
    }
}
