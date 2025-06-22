public class QuickSort implements OrdersSorting {
    public void sortItems(Order arr[]){
        quickSort(arr, 0, arr.length-1);
    }

    void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    int partition(Order[] arr, int low, int high) {
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i].totalprice>=arr[low].totalprice && i<=high-1){
                i++;
            }
            while(arr[j].totalprice<arr[low].totalprice && j>=1){
                j--;
            }
            if(i<j){
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Order temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
