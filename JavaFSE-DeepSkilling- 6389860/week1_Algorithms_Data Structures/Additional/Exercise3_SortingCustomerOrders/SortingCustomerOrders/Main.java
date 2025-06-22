public class Main{
    public static void main(String[] args) {
        Order arr[] = new Order[6];
        arr[0] = new Order("ABC789", "Amar   ", 5500.0);
        arr[1] = new Order("ABC123", "Neeraj ", 2050.0);
        arr[2] = new Order("ABC456", "Rajesh ", 4000.0);
        arr[3] = new Order("ABC323", "Uday   ", 3100.0);
        arr[4] = new Order("ABC286", "Sudheer", 1080.0);
        arr[5] = new Order("ABC473", "Harsha ", 6900.0);

        /*Bubble Sort - O(N^2) */
        // BubbleSort BSort = new BubbleSort();
        // BSort.sortItems(arr);

        /*Quick Sort - O(NlogN) */
        QuickSort QSort = new QuickSort();
        QSort.sortItems(arr);
        
        DisplayOrdersList.display(arr);
    }
}