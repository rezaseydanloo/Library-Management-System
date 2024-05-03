package Library;

import java.util.HashMap;

public class Rent {

    private  int RentalId;
    private int UserId ;
    private String RentalDate ;
    private String BookName ;

    Library LibraryObject = new Library();


    public Rent (int RentalId , int UserId , String BookNmae , String RentalDate){

        this.RentalId=RentalId;
        this.UserId=UserId;
        this.BookName=BookNmae;
        this.RentalDate=RentalDate;

    }

    public int getRentalId() {
        return RentalId;
    }

    public int getUserId() {
        return UserId;
    }

    public String getRentalDate() {
        return RentalDate;
    }

    public String getBookName() {
        return BookName;
    }
}
