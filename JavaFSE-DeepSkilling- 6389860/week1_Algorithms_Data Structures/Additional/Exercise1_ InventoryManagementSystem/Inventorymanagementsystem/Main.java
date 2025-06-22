public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(5, "Fastrack Watch", 100, 200.0);
        Product p2 = new Product(4, "Cargo-Jeans", 120, 250.0);
        Product p3 = new Product(2, "Zebronics Keyboard", 50, 500.0);
        Product p4 = new Product(10, "Mens Trimmer", 80, 300.0);
        Product p5 = new Product(6, "Sony 4.0 Surround System", 20, 10000.0);
        Product p6 = new Product(1, "Pegion Induction Stove", 50, 1300.0);
        Product p7 = new Product(7, "V-gaurd Water Heater", 45, 1000.0);
        Product p8 = new Product(3, "Hp latop", 15, 50000.0);
        Product p9 = new Product(9, "Crompton Ceiling Fan", 50, 1200.0);
        Product p10 = new Product(8, "Bambino Vermicelli 5kg packet", 60, 200.0);

        ProductStore store = new ProductStore();
        //adding product
        store.addProduct(p1);store.addProduct(p2);store.addProduct(p3);store.addProduct(p4);store.addProduct(p5);
        store.addProduct(p6);store.addProduct(p7);store.addProduct(p8);store.addProduct(p9);store.addProduct(p10);

        System.out.println();

        //update product
        store.updateProduct(3, "Hp laptop", 25, 51000);
        store.updateProduct(4, "Cargo-Jeans", 100, 250.0);

        System.out.println();

        //get product
        Product p = store.geProduct(11);
        DisplayProduct.display(p);
    }
}
