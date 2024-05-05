package Library;

public class NormalUser {

    private String FirstName ;
    private String LastName ;
    private int UserId ;
    private int UserPhoneNumber ;
    private String RegistrationTime ;

    Library LibraryObject = new Library();

    public NormalUser(String firstName, String lastName, int userId, int userPhoneNumber, String registrationTime) {
        FirstName = firstName;
        LastName = lastName;
        UserId = userId;
        UserPhoneNumber = userPhoneNumber;
        RegistrationTime = registrationTime;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getUserId() {
        return UserId;
    }

    public int getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public String getRegistration() {
        return RegistrationTime;
    }
}
