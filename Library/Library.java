package Library;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Library  {


    ArrayList <Book> BookRepository = new ArrayList<>();
    ArrayList <Admin> AdminInformation  = new ArrayList<>();
    ArrayList <NormalUser> NormalUserList = new ArrayList<>();
    HashMap<String,Rent> RentInformation = new HashMap<>();


    //------------------------------------------------------------------------------------------------------------------

    public void add_book (String BookName , String Author , String Description){

        Book BookObject = new Book(BookName,Author,Description,IdMaker(BookName,Author),true);
        BookRepository.add(BookObject);

    }

    //------------------------------------------------------------------------------------------------------------------


    public void add_admin (String FirstName , String LastName , int AdminId , int AdminPassword ){

        Admin AdminObject =new Admin(FirstName , LastName , IdMaker(FirstName,LastName) , AdminPassword);
        AdminInformation.add(AdminObject);

    }

    //------------------------------------------------------------------------------------------------------------------

    public void add_newUser (String FirstName ,String LastName , int UserId, int UserPhoneNumber, int RegistrationTime){


        Date DateNow = new Date();
        NormalUser NormalUserObject= new NormalUser(FirstName , LastName , IdMaker(FirstName,LastName) , UserPhoneNumber , DateNow.toString());
        NormalUserList.add(NormalUserObject);

    }

    //------------------------------------------------------------------------------------------------------------------

    public void Register_Rent (int RentalId , int UserId , String BookNmae , String RentalDate){


        Date DateNow = new Date();
        Rent RentObject = new Rent(RentalId , UserId , BookNmae , DateNow.toString());

    }

    //------------------------------------------------------------------------------------------------------------------

    public int IdMaker (String input1 , String input2){

        char[] inPutString ;
        String str;

        input1+=input2;


        inPutString = input1.toCharArray();
        int ID=0;


        for (int i=0 ; i<inPutString.length ; i++){
            ID+=(int)inPutString[i];
        }

        return ID;

    }

    //------------------------------------------------------------------------------------------------------------------





}
