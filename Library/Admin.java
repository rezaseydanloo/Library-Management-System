package Library;

public class Admin {

    private String FirstName ;
    private String LastName ;
    private int AdminId ;
    private String AdminPassword ;

    public Admin(String firstName, String lastName, int adminId, String adminPassword) {

        this.FirstName = firstName;
        this.LastName = lastName;
        this.AdminId = adminId;
        this.AdminPassword = adminPassword;

    }


    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public int getAdminId() {
        return this.AdminId;
    }

    public String getAdminPassword() {
        return this.AdminPassword;
    }
}
