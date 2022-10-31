package arrayListEx;

import java.util.ArrayList;

public class ListOfProducts {
    public static void main(String[] args) {
        Product p1=new Product("clinic plus","good smoothness",42532,1);
        Product p2=new Product("head&shoulder","stop hairfall",87654,2);
        Product p3=new Product("dove","hair shining & remove dundruff",7413,5);

        ArrayList<Product>productList=new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        Order o1=new Order(8643,1245,"shampoo",productList); //order1
        o1.TotalPrice();

        ArrayList<Product>productListA=new ArrayList<>();                //order2
        Order o2=new Order(9854,123456,"soap",productListA);
        o2.addProduct(p1);
        System.out.println(o2.getProductList().size());

        o1.removeById(7413);
        System.out.println(o1.getProductList().size());
    }
}
