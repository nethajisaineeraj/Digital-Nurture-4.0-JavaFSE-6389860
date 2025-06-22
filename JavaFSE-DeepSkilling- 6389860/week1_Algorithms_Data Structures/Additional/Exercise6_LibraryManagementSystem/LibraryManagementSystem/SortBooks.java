import java.util.Arrays;
import java.util.Comparator;

public class SortBooks {
    public Book[] sort(Book arr[]){
        Comparator<Book> comparator = new Comparator<Book>() {
            public int compare(Book a, Book b) {
                return Integer.compare(a.bookId, b.bookId);
            }
        };
        Arrays.sort(arr, comparator);
        return arr;
    }
}
