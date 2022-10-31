public class Method {
    static String myMethod(String a, String b, int c){
        return a+" "+b+" "+c;
    }

    public static void studentDetails(String name,String subject,Double mark){
        System.out.println("Student name:::"+name+" "+"Subject:::"+subject+" "+"mark:::"+mark);
    }


    public static void main(String[] args) {
        String d=myMethod("Udhaya","Surithi",55);
        System.out.println(d);


        studentDetails("shenba","tamil",75.0);
        studentDetails("pradeep","tamil",15.0);
    }
}
