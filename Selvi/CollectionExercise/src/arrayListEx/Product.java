package arrayListEx;

public class Product {
  private String Productname;
  private String description;
  private int id;
  private int price;

    public Product(String Productname,String description,int id, int price){
        this.Productname=Productname;
        this.description=description;
        this.id=id;
        this.price=price;

    }
    public String getProductname() {
        return Productname;
    }
    public void setProductname(String productname) {
        Productname = productname;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
