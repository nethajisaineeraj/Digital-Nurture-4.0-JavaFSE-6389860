public class Order {
    String orderId;
    String customerName;
    double totalprice;
    public Order(String orderId, String customerName, double totalprice){
        this.customerName = customerName;
        this.orderId = orderId;
        this.totalprice = totalprice;
    }
}
