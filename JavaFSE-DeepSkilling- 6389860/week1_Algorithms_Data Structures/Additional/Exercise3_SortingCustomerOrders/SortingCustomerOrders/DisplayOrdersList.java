public class DisplayOrdersList {
    public static void display(Order arr[]){
        System.out.println("OrderId"+"  "+"CustomerName"+"  "+"TotalPrice");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].orderId+"   "+arr[i].customerName+"       "+arr[i].totalprice);
        }
    }
}
