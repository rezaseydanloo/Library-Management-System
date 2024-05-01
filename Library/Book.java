package Library;

public class Book {

    private String BookName ;
    private String Author ;
    private String Description ;
    private int BookId ;
    private boolean BookStatus;

    public Book(String bookName, String author, String description, int bookId, boolean bookStatus) {

        this.BookName = bookName;
        this.Author = author;
        this.Description = description;
        this.BookId = bookId;
        this.BookStatus = bookStatus;

    }

    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public int getBookId() {
        return BookId;
    }

    public boolean isBookStatus() {
        return BookStatus;
    }
}
