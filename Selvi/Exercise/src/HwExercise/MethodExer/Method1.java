package HwExercise.MethodExer;

public class Method1 {
    public static String wildAnimals(String name,String Animalsound,int noOfAnimals){
        return name+" "+Animalsound+" "+noOfAnimals;
    }
    public static void domesticAnimal(String name,String Animalsound,int noOfAnimals){
        System.out.println(name+" "+Animalsound+" "+noOfAnimals);
    }

    public static void main(String[] args) {
        String w=wildAnimals("lion","urrr",2);
        String y=wildAnimals("tiger","urr",1);
        System.out.println(w+y);
        domesticAnimal("ShuruthiCat","meow",3);
        domesticAnimal("dog","vovvov",2);
    }
}
