package methodOverLoad;

public class Animal {


    public void AnimalPrint(String food,String drinks) {
        System.out.println(food + "" + drinks);

    }
    public  void AnimalPrint(String name,int noOfAnimals){
        System.out.println(name+" "+noOfAnimals);

    }

}
