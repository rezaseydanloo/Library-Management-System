package Library;

public class Admin {

    private String FirstName ;
    private String LastName ;
    private int AdminId ;
    private int AdminPassword ;

    Library LibraryObject = new Library();

    public Admin(String firstName, String lastName, int adminId, int adminPassword) {

        FirstName = firstName;
        LastName = lastName;
        AdminId = adminId;
        AdminPassword = adminPassword;

        Rent test = new Rent(5645 , 545 , "sadfdf " , "cdcdc");

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAdminId() {
        return AdminId;
    }

    public int getAdminPassword() {
        return AdminPassword;
    }
}
