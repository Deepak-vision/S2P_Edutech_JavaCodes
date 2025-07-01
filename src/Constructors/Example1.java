package Constructors;
class ProductDetails{
    private String productName;
    private int productId;
    private double productPrice;
    private String brandName;

    // No Argument Constructor;
    public ProductDetails(){
        productName = "Parle G";
        productId = 101;
        productPrice =10;
        brandName = "Parle";

    }
    // All Argument Constructor;
    public ProductDetails(String productName,int productId,double productPrice,String brandName){
        System.out.println("Product Name :"+productName);
        System.out.println("Product ID :"+productId);
        System.out.println("Product Price :"+productPrice);
        System.out.println("Product BrandName :"+brandName);
        System.out.println("\n");

   }
    public void productData(){
        System.out.println("Product Name :"+productName);
        System.out.println("Product ID :"+productId);
        System.out.println("Product Price :"+productPrice);
        System.out.println("Product BrandName :"+brandName);

    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductId(int id){
        this.productId=id;
    }
    public int getProductId(){
        return productId;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName(){
        return brandName;
    }
}
public class Example1 {
    public static void main(String[] args) {
     ProductDetails p2 = new ProductDetails();
        ProductDetails p1 = new ProductDetails("milk",101,10,"Amul");
        p2.productData();




    }
}
