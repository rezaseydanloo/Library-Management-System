package Library;

import java.util.HashMap;

public class Rent {

    demoRent demoRentobj;
    HashMap <Integer,demoRent> Rental_information = new HashMap<>();

    public void Rental_Record (int userID) {

        demoRentobj = new demoRent();
        Rental_information.put(userID,demoRentobj);

    }
}
