package Inheritance;

public class Fruits {
    private String name;
    private String colour;

    Fruits (String name,String colour){
        this.name=name;
        this.colour=colour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void apple(){
        System.out.println("selvi is a apple");
    }


}
