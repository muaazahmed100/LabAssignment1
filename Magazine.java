public class Magazine extends LibraryItem{
    private String issueNumber;

    Magazine(String issueNumber,String title,int author,int year){
        super(title,author,year);
        this.issueNumber=issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber='" + issueNumber + '\'' +
                '}';
    }
}
