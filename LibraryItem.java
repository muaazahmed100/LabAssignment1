import javax.swing.*;

public class LibraryItem {
    private String title;
    private int author;
    private int year;
    private boolean isBorrowed;

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    private LibraryItemType itemType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    LibraryItem(String title,int author,int year){
        this.title=title;
        this.author=author;
        this.year=year;

    }
    public boolean equals(Object obj){
        LibraryItem temp=(LibraryItem) obj;
        if (this.getTitle().equalsIgnoreCase(temp.getTitle())&&this.getAuthor()==temp.getAuthor()&&this.getYear()== temp.getYear())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", isBorrowed=" + isBorrowed +
                ", itemType=" + itemType +
                '}';
    }
}
