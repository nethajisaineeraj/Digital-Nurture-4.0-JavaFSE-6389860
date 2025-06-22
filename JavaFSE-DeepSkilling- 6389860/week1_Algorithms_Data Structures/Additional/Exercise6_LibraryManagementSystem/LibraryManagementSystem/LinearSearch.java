public class LinearSearch implements SearchClass{
    public Book search(int id, Book arr[]){
        for(Book book: arr){
            if(book.bookId==id)
                return book;
        }
        return null;
    }
}
