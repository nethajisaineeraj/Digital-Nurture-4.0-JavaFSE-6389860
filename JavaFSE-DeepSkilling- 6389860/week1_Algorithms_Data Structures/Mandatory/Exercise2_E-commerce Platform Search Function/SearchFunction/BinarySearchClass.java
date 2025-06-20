public class BinarySearchClass {
    public static Product binarySearch(int id, Product arr[]){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid].productId==id)
                return arr[mid];
            if(arr[mid].productId<id)
                low = mid+1;
            else
                high = mid-1;
        }
        return null;
    }
}
