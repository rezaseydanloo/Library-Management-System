package Library;

public class demoRent {


    private int userId;
    private int RentalID;
    private int RentalDate;
    private int bookID;
    static String BookName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRentalID() {
        return RentalID;
    }

    public void setRentalID(int rentalID) {
        RentalID = rentalID;
    }

    public int getRentalDate() {
        return RentalDate;
    }

    public void setRentalDate(int rentalDate) {
        RentalDate = rentalDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public static String getBookName() {
        return BookName;
    }

    public static void setBookName(String bookName) {
        BookName = bookName;
    }
}
