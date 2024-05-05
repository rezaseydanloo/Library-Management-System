package Library;

public class Admin {

    private String FirstName ;
    private String LastName ;
    private int AdminId ;
    private String AdminPassword ;

    Library LibraryObject = new Library();

    public Admin(String firstName, String lastName, int adminId, String adminPassword) {

        FirstName = firstName;
        LastName = lastName;
        AdminId = adminId;
        AdminPassword = adminPassword;
        

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

    public String getAdminPassword() {
        return AdminPassword;
    }
}
