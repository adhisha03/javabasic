package arrayListEx;

import java.util.ArrayList;

public class Order {
    private int orederId;
    private   int customerId;
    private   String products;
    private ArrayList<Product>productList;

    public Order(int orderID,int customerId,String products,ArrayList<Product>productList) {
        this.orederId=orderID;
        this.customerId = customerId;
        this.products = products;
        this.productList=productList;

   }

    public int getOrederId() {
        return orederId;
    }

    public void setOrederId(int orederId) {
        this.orederId = orederId;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getProducts() {
        return products;
    }
    public void setProducts(String products) {
        this.products = products;
    }
    public ArrayList<Product>getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }


    //methods
    public void TotalPrice(){
    int sum=0;
    for(Product product:productList){
        sum=sum+product.getPrice();
    }
        System.out.println(sum);
    }
    public void addProduct(Product product){
        productList.add(product);

    }
    public void removeById(int productId){
        ArrayList<Product>products1=new ArrayList<>();
        for (Product product:productList) {
            if (product.getId() != productId) {
                products1.add(product);
            }
        }
                productList=products1;

    }
}


