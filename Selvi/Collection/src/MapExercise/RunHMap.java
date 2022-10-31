package MapExercise;

import java.util.HashMap;

public class RunHMap {
    public static void main(String[] args) {
        HashMap<DetailsHM,Integer> hm=new HashMap<>();
        DetailsHM selvi=new DetailsHM("selvi",2);
        DetailsHM udhaya=new DetailsHM("udhaya",3);
        DetailsHM shruthi=new DetailsHM("shruthi",60);
        DetailsHM sanjay=new DetailsHM("sanjay",101);

        hm.put(selvi,1);
        hm.put(udhaya,100);
        hm.put(shruthi,200);
        hm.put(sanjay,300);

        System.out.println(hm.get(selvi));
        System.out.println(new DetailsHM("selvi",2));



    }
}
