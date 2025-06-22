public class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    public Product(int productId, String productName, int quantity, double price){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void setProductId(int productId){
        this.productId = productId;
    }
    void setProductName(String productName){
        this.productName = productName;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void setPrice(double price){
        this.price = price;
    }
    int getProductID(){
        return this.productId;
    }
    String getProductName(){
        return this.productName;
    }
    int getQuantity(){
        return this.quantity;
    }
    double getPrice(){
        return this.price;
    }
}
