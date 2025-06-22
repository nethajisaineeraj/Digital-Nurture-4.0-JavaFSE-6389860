public class BubbleSort implements OrdersSorting {
    public void sortItems(Order arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j].totalprice < arr[j+1].totalprice){
                    /*swap */
                    Order temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
