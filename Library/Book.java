package Library;

public class Book {

    private String Description ;
    private String BookName ;
    private String Author ;
    private int BookId ;
    private boolean BookStatus;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public boolean isBookStatus() {
        return BookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        BookStatus = bookStatus;
    }
}
