public class Book extends LibraryItem{
    private String pageCount;
    Book(String pageCount,String title,int author,int year){
        super(title,author,year);
        this.pageCount=pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount='" + pageCount + '\'' +
                '}';
    }
}
