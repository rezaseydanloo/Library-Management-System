package Library;

import java.util.ArrayList;
import java.util.Date;

public class Library  {


    ArrayList <Book> BookRepository = new ArrayList<>();
    ArrayList <Admin> AdminList = new ArrayList<>();
    ArrayList <NormalUser> NormalUserList = new ArrayList<>();
    ArrayList <Rent> RentList = new ArrayList<>();



    //------------------------------------------------------------------------------------------------------------------

    public void add_book (String BookName , String Author , String Description){

        Book BookObject = new Book(BookName,Author,Description,100000+IdMaker(BookName,Author),true);
        BookRepository.add(BookObject);

    }

    //------------------------------------------------------------------------------------------------------------------


    public void add_admin (String FirstName , String LastName ,String AdminPassword ){

        Admin AdminObject = new Admin (FirstName , LastName , IdMaker(FirstName , LastName),  AdminPassword );
        this.AdminList.add(AdminObject);



    }

    //------------------------------------------------------------------------------------------------------------------

    public void add_newUser (String FirstName ,String LastName , int UserId, int UserPhoneNumber, int RegistrationTime){


        Date DateNow = new Date();
        NormalUser NormalUserObject= new NormalUser(FirstName , LastName , IdMaker(FirstName,LastName) , UserPhoneNumber , DateNow.toString());
        NormalUserList.add(NormalUserObject);

    }

    //------------------------------------------------------------------------------------------------------------------

    public void Register_Rent ( int UserId , String BookNmae , String UserName){


        Date DateNow = new Date();
        Rent RentObject = new Rent(IdMaker(BookNmae,UserName) , UserId , BookNmae , DateNow.toString());
        RentList.add(RentObject);

    }

    //------------------------------------------------------------------------------------------------------------------


    public void NormalUserIdFinder(String FirstName , String LastName) {

        boolean status = false;
        System.out.println("|---list ");

        for (int i = 0 ; i<NormalUserList.size() ; i++){

            if (FirstName.equals(NormalUserList.get(i).getFirstName()) && LastName.equals(NormalUserList.get(i).getLastName())){

                System.out.println("|- FName : " + FirstName );
                System.out.println("|- LName : " + LastName  );
                System.out.println("|- ID : " + NormalUserList.get(i).getUserId());
                System.out.print("|----------------------------------------------------");
                status = true;

            }

            else if (status==true){
                System.out.println("|-! user not found (maybe user have not registered yet) . ");
            }

        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public void AdminIdFinder (){

        Library object = new Library();

        for (int i=0 ; i<AdminList.size() ; i++){

            System.out.println("|-Admin First Name : " + AdminList.get(i).getFirstName());
            System.out.println("|-Admin Last  Name : " + AdminList.get(i).getLastName());
            System.out.println("|-Admin ID         : " + AdminList.get(i).getAdminId());
            System.out.println("|--------------------------------------------------------");

        }

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
