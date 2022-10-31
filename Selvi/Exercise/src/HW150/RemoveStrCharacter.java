package HW150;

public class RemoveStrCharacter {
    public static void main(String[] args) {
        String name="goodBye";
        System.out.println(removeCharAt(name,2));
    }
   public static String removeCharAt( String n,int pos){
    return n.substring(0,pos)+n.substring(pos+1);
}
}
