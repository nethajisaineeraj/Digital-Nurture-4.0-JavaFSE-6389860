public class LinearSearchClass {
    public static Product linearSearch(int id, Product arr[]){
        for(Product product: arr){
            if(product.productId==id)
                return product;
        }
        return null;
    }
}
