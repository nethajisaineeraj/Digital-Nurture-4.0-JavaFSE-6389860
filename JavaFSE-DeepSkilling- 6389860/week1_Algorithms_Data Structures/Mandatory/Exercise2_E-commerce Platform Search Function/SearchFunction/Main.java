public class Main {
    public static void main(String[] args) {
        Product arr[] = new Product[6];
        Product obj1 = new Product(5, "Watch", "Electronics");  arr[0] = obj1;
        Product obj2 = new Product(1, "Rice", "Grocery");  arr[1] = obj2;
        Product obj3 = new Product(0, "Pulses", "Grocery");  arr[2] = obj3;
        Product obj4 = new Product(4, "Hair Dryer", "Electronics");  arr[3] = obj4;
        Product obj5 = new Product(3, "Trousers", "Clothing"); arr[4] = obj5;
        Product obj6 = new Product(2, "Fruit Jam", "Grocery");  arr[5] = obj6;

        /*Searching for a product with the id=4 using Linear Seach */
        /* Linear Search:
            - Best case: O(1) → Product found at the first index.
            - Average case: O(N/2)
            - Worst case: O(N) → Product not found or at the last index.
        */
        /*Search for the product if it is present print its details*/
        int searchedProductid = 7;
        Product searchedProduct1 = LinearSearchClass.linearSearch(searchedProductid, arr);
        DisplayProduct out1 = new DisplayProduct(searchedProduct1, searchedProductid); 
        out1.displayProductDetails();

        /*Searhing for a product with id=3 using Binary Search on the sorted list of products */
        /* Binary Search:
            - Best case: O(1) → Product found at the middle index on first try.
            - Average case: O(log N)
            - Worst case: O(log N) → Product not found after dividing the search space repeatedly.
            - Note: Requires the array to be sorted based on the key (e.g., productId).
        */
        /*since we are using BS we need to sort it so sort it by invoking SortProducts class */
        SortProducts obj = new SortProducts();
        Product sortedList[] = obj.sort(arr);
        Product searchedProduct2 = BinarySearchClass.binarySearch(searchedProductid, sortedList);
        DisplayProduct out2 = new DisplayProduct(searchedProduct2, searchedProductid); 
        out2.displayProductDetails();
    }
}
