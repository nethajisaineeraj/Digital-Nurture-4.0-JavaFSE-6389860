public class DisplayBook {
    Book obj;
    int id;
    public DisplayBook(Book obj,int id){
        this.obj = obj;
        this.id = id;
    }
    void displayBookDetails(){
        if(obj!=null){
            System.out.println("Book Id: "+obj.bookId);
            System.out.println("Book Title: "+obj.title);
            System.out.println("Author: "+obj.author);
        }
        else
            System.out.println("Error: No Book Found with id "+id);
    }
}
