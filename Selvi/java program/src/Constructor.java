public class Constructor {
    public static void main(String[] args){
        Dress dressObj=new Dress("leggins","black","prisma", 30);
        System.out.println(dressObj.name);
        System.out.println(dressObj.colour);
        System.out.println(dressObj.brand);
        System.out.println(dressObj.size);
    }
}
class Dress{
    String name;
    String colour;
    String brand;
    int size;

    public Dress(String name,String colour, String brand, int size){
        this.name=name;
        this.colour=colour;
        this.brand=brand;
        this.size=size;
    }
}
