package Library;

import java.util.ArrayList;
import java.util.Date;

public class Library  {


    ArrayList <Book> BookRepository = new ArrayList<Book>();
    ArrayList <Admin> AdminList = new ArrayList<>();
    ArrayList <NormalUser> NormalUserList = new ArrayList<>();
    ArrayList <Rent> RentList = new ArrayList<>();

    private int Capacity=10;
    private int H=0;
    private int M=0;

    public void setH(int h) {
        H = h;
    }

    public void setM(int m) {
        M = m;
    }

    public int getH() {
        return H;
    }

    public int getM() {
        return M;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    //------------------------------------------------------------------------------------------------------------------

    public void add_book (String BookName , String Author , String Description){

        if (Capacity>BookRepository.size()){


            boolean status = false;
            BookName=BookName.toLowerCase();
            Author=Author.toLowerCase();

            for (int i = 0 ; i< BookRepository.size() ; i++){

                if (BookName.equals(BookRepository.get(i).getBookName())&&Author.equals(BookRepository.get(i).getAuthor())){

                    status = true ;
                    System.out.println("|--! book already added ");
                }
            }

            if (status==false){

                Book BookObject = new Book(BookName,Author,Description,IdMaker(BookName,Author),true);
                this.BookRepository.add(BookObject);


            }
        }

        else
            System.out.println("|--! Library's capacity is full ");





    }

    //------------------------------------------------------------------------------------------------------------------


    public void add_admin (String FirstName , String LastName ,String AdminPassword ){


        boolean status = false;

        FirstName=FirstName.toLowerCase();
        LastName=LastName.toLowerCase();

        for (int i = 0 ; i< BookRepository.size() ; i++){

            if (FirstName.equals(AdminList.get(i).getFirstName())&&LastName.equals(AdminList.get(i).getLastName())){

                status = true ;
                System.out.println("|--! Admin already added ");
            }
        }

        if (status==false){

            Admin AdminObject = new Admin (FirstName , LastName , IdMaker(FirstName , LastName),  AdminPassword );
            this.AdminList.add(AdminObject);


        }


    }

    //------------------------------------------------------------------------------------------------------------------

    public void add_newUser (String FirstName ,String LastName , String UserPhoneNumber){


        Date DateNow = new Date();
        boolean status = false;

        FirstName=FirstName.toLowerCase();
        LastName=LastName.toLowerCase();



        for (int i = 0 ; i< NormalUserList.size() ; i++){

            if (FirstName.equals(NormalUserList.get(i).getFirstName())&&LastName.equals(NormalUserList.get(i).getLastName())){

                status = true ;
                System.out.println("|--! member already added ");
            }
        }

        if (status==false){

            NormalUser NormalUserObject= new NormalUser(FirstName , LastName , IdMaker(FirstName,LastName) , UserPhoneNumber , DateNow.toString());
            NormalUserList.add(NormalUserObject);

        }


    }

    //------------------------------------------------------------------------------------------------------------------

    public void ReturnBook (String BookName){


        BookName=BookName.toLowerCase();

        for (int i = 0 ; i<BookRepository.size() ; i++){

            if(BookName.equals(BookRepository.get(i).getBookName())){


                Book BookObject = new Book(BookRepository.get(i).getBookName(),BookRepository.get(i).getAuthor(),
                        BookRepository.get(i).getDescription(),BookRepository.get(i).getBookId(),true);

                BookRepository.set(i,BookObject);

            }
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public void RemoveMember(int MemberId){

        for (int i=0 ; i<NormalUserList.size() ; i++){

            if (MemberId==NormalUserList.get(i).getUserId()){

                NormalUserList.remove(i);
            }
        }
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public void Register_Rent (  String BookNmae , String FirstName , String LastName , String UserId){

        BookNmae=BookNmae.toLowerCase();
        FirstName=FirstName.toLowerCase();
        LastName=LastName.toLowerCase();
        boolean status = false;

        for (int i =0 ; i<BookRepository.size() ; i++){

            if (BookNmae.equals(BookRepository.get(i).getBookName())&& BookRepository.get(i).isBookStatus()==false){
                System.out.println("|--! book is not available ");
                status=true;
            }

        }


        if (status==false){

            Date DateNow = new Date();
            Rent RentObject = new Rent(IdMaker(BookNmae,LastName+FirstName) , UserId , BookNmae , DateNow.toString());
            RentList.add(RentObject);


            for (int i=0 ; i<BookRepository.size() ; i++){
                if (BookNmae.equals(BookRepository.get(i).getBookName())){

                    Book BookObject = new Book(BookRepository.get(i).getBookName(),BookRepository.get(i).getAuthor(),
                            BookRepository.get(i).getDescription(),BookRepository.get(i).getBookId(),false);

                    BookRepository.set(i,BookObject);

                }

            }


        }


    }

    //------------------------------------------------------------------------------------------------------------------

    public void available (){


            for (int i = 0 ; i<BookRepository.size() ; i++){

                System.out.println("|- Book   name : " + BookRepository.get(i).getBookName());
                System.out.println("|- Author name : " + BookRepository.get(i).getAuthor());
                System.out.println("|- Description : " + BookRepository.get(i).getDescription());
                System.out.println("|- Book ID     : " + BookRepository.get(i).getBookId());
                System.out.println("|- Book status : " + BookRepository.get(i).isBookStatus());
                System.out.println("|--------------------------------------------------------");


        }
    }

    //------------------------------------------------------------------------------------------------------------------


    public void NormalUserIdFinder(String FirstName , String LastName) {


        System.out.println("|---list ");
        if (NormalUserList.size()==0){

            System.out.println("|-!User has not been added yet");
            System.out.println("|--------------------------------------------------------");
        }

        for (int i = 0 ; i<NormalUserList.size() ; i++){

            if (FirstName.equals(NormalUserList.get(i).getFirstName()) && LastName.equals(NormalUserList.get(i).getLastName())){

                System.out.println("|- FName : " + FirstName );
                System.out.println("|- LName : " + LastName  );
                System.out.println("|- ID : " + NormalUserList.get(i).getUserId());
                System.out.println("|- join time : " + NormalUserList.get(i).getRegistrationTime());
                System.out.println("|----------------------------------------------------------");

            }
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public void AdminIdFinder (){


        if (AdminList.size()==0){
            System.out.println("|-admin has not been added yet");
            System.out.println("|--------------------------------------------------------");
        }

        for (int i=0 ; i<AdminList.size() ; i++){

            System.out.println("|-Admin First Name : " + AdminList.get(i).getFirstName());
            System.out.println("|-Admin Last  Name : " + AdminList.get(i).getLastName());
            System.out.println("|-Admin ID         : " + AdminList.get(i).getAdminId());
            System.out.println("|---------------------------------------------------------");

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


    public boolean AdminSupervision(String AdminFisrtName , String AdminLastName , String AdminPassword) {


        if (AdminList.size()==0){

            System.out.println("|-! Admin has not been added yet ");
            return false;
        }

        for (int i = 0 ; i<AdminList.size() ; i++){

            if (AdminFisrtName.equals(AdminList.get(i).getFirstName())){

                if (AdminLastName.equals(AdminList.get(i).getLastName())){

                    if (AdminPassword.equals(AdminList.get(i).getAdminPassword())){

                        return true;

                    }
                }
            }
        }

        return false;
    }


    //------------------------------------------------------------------------------------------------------------------


    public void RemoveAdmin(int AdminRemove){

        for (int i=0 ; i<AdminList.size() ; i++){

            if (AdminRemove==AdminList.get(i).getAdminId()){

                AdminList.remove(i);
                System.out.println("|- remove Admin successfully ");
            }
        }
    }
}
