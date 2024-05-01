package Library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {


    ArrayList <Book> BookRepository = new ArrayList<>();
    ArrayList <Admin> AdminInformation  = new ArrayList<>();


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

    public int IdMaker (String input1 , String input2){

        String[] inPutString ;
        input1+=input2;
        inPutString=input1.split("");
        int ID=0;


        for (int i=0 ; i<inPutString.length ; i++){
            ID+=Integer.getInteger(inPutString[i]);
        }

        return ID;

    }

    //------------------------------------------------------------------------------------------------------------------





}
