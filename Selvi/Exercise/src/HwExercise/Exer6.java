package HwExercise;

public class Exer6 {
    public static void main(String[] args) {

        String[] name={"Suba","Priya","PooVili","Anbarasi","Udhaya","Anusha"};
        for (int i=0;i< name.length;i++){

        char lastChar=name[i].charAt(name[i].length()-1);
        if(lastChar=='a'){
            System.out.println(name[i]);
        }
        }
    }
}
