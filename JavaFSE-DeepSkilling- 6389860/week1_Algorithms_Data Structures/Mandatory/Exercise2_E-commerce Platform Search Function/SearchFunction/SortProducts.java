import java.util.Arrays;
import java.util.Comparator;

public class SortProducts {
    public Product[] sort(Product arr[]){
        Comparator<Product> comparator = new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return Integer.compare(a.productId, b.productId);
            }
        };
        Arrays.sort(arr, comparator);
        return arr;
    }
}
