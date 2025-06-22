import java.util.HashMap;

public class ProductStore {
    public static HashMap<Integer, Product> store = new HashMap<>();
    public void addProduct(Product p){
        store.put(p.productId, p);
        System.out.println("Product added Successfully.");
    }
    public Product geProduct(int productId){
        if(!store.containsKey(productId)){
            System.out.println("Product not found with ID: " + productId);
            return null;
        }
        return store.get(productId);
    }
    public void updateProduct(int productId, String newName, int newQuantity, double newPrice) {
    if (store.containsKey(productId)) {
        Product p = store.get(productId);
        p.setProductName(newName);
        p.setQuantity(newQuantity);
        p.setPrice(newPrice);
        System.out.println("Product updated successfully.");
    } else {
        System.out.println("Product not found with ID: " + productId);
    }
}

}
