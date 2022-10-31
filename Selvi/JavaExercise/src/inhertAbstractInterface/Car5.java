package inhertAbstractInterface;

public class Car5 extends Car4 implements Car2{
    @Override
    public void details(String carName, String colour, int price) {
        System.out.println(carName);
        System.out.println(colour);
        System.out.println(price);

    }

    @Override
    public void Car2Details(String carName, String colour, int price) {
        System.out.println(carName);
        System.out.println(colour);
        System.out.println(price);

    }

    @Override
    void detail() {

    }
}
