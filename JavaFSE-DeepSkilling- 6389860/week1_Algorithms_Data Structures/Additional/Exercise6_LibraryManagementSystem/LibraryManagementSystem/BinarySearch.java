public class BinarySearch implements SearchClass {
    public Book search(int id, Book arr[]){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid].bookId==id)
                return arr[mid];
            if(arr[mid].bookId<id)
                low = mid+1;
            else
                high = mid-1;
        }
        return null;
    }
}
