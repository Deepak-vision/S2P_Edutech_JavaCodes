package OOPS;

class Product {
       private int productId;
       private String productName;
       private int productPrice;

       public void setProductId(int id){
           productId=id;

       }
       public int getProductId(){
           return productId;
       }
       public void setProductName(String name){
           productName=name;

       }
       public String getProductName(){
           return productName;
       }
       public void setProductPrice(int price){
           productPrice=price;
       }
       public int getProductPrice() {
        return productPrice;
       }

       public void printProductDetails(){
           System.out.println("ProductId:"+productId);
           System.out.println("ProductName:"+productName);
           System.out.println("ProductPrice:"+productPrice);
           System.out.println("\n");

       }
}
public class Example1 {
    public static void main(String[] args) {
        Product eId1 =new Product();
        eId1.printProductDetails();

        eId1.setProductId(101);
        eId1.setProductName("Oats");
        eId1.setProductPrice(600);

        eId1.getProductId();
        eId1.getProductName();
        eId1.getProductPrice();
        eId1.printProductDetails();


    }
}
