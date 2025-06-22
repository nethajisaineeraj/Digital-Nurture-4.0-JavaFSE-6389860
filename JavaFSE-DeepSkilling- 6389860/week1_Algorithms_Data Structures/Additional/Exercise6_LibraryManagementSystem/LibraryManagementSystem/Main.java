public class Main {
    public static void main(String[] args) {
        Book arr[] = new Book[6];
        arr[0] = new Book(5, "The God of Small Things", "Arundhati Roy");
        arr[1] = new Book(1, "Midnight's Children", "Salman Rushdie");
        arr[2] = new Book(0, "The White Tiger", "Aravind Adiga");
        arr[3] = new Book(4, "Malgudi Days", "R.k.Narayan");
        arr[4] = new Book(3, "Train to Pakistan", "Khushwant Singh");
        arr[5] = new Book(2, "A Suitable Boy ", "Vikram Seth");

        System.out.println("/*Linear Search*/");

        int searchedBookId = 4;
        SearchClass s1 = new LinearSearch();
        Book searchedBook1 = s1.search(searchedBookId, arr);
        DisplayBook out1 = new DisplayBook(searchedBook1, searchedBookId);
        out1.displayBookDetails();

        System.out.println("\n/*Binary Search*/");

        SortBooks obj = new SortBooks();
        Book sortedList[] = obj.sort(arr);
        SearchClass s2 = new BinarySearch();
        Book searchedBook2 = s2.search(searchedBookId, sortedList);
        DisplayBook out2 = new DisplayBook(searchedBook2, searchedBookId); 
        out2.displayBookDetails();
    }
}
