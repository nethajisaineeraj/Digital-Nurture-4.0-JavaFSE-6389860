public class DisplayProduct {
    Product obj;
    int id;
    public DisplayProduct(Product obj,int id){
        this.obj = obj;
        this.id = id;
    }
    void displayProductDetails(){
        if(obj!=null){
            System.out.println("Product Id: "+obj.productId);
            System.out.println("Product Name: "+obj.productName);
            System.out.println("Category: "+obj.category);
        }
        else
            System.out.println("Error: No Product Found with id "+id);
    }
}
