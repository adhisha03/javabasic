package HwExercise;

import java.util.Arrays;

public class DuplicateArrayInString {
    public static void main(String[] args) {
      String name[]={"seetha","udhaya","selvi","shruthi","dharshni","selvi","anbu","selvi","udhaya","shruthi"};
        System.out.println(Arrays.toString(name)+" ");
        for(int i=0;i< name.length;i++){
            if (name[i]!=null){

                for (int j=i+1;j< name.length;j++){
                    if (name[i].equals(name[j])){
                        name[j]=null;
                    }
                }
            }
            System.out.println();
            for (int k=0;k< name.length;k++){
                if (name[k]!=null){
//                    System.out.println([k]+" ");
                }
            }
        }
    }
}





