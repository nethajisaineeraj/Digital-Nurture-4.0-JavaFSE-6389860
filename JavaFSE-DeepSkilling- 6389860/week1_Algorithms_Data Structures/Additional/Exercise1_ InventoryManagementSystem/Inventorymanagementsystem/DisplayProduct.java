public class DisplayProduct {
    public static void display(Product p){
        if(p==null) return ;
        System.out.println("Product Id: "+p.getProductID());
        System.out.println("Product Name: "+p.getProductName());
        System.out.println("Quantity: "+p.getQuantity());
        System.out.println("Product Price: "+p.getPrice());
    }
}
