package CLIcommand;

import Library.Library;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clicommand {

    public void cli() {

        Date date = new Date();

        System.out.println("|-----cli -- " + date.toString());
        System.out.println("|-lib add book <name> <author> <Description>     :Add a new book to the library.");
        System.out.println("|-lib get hrs                                    :Retrieve library operating hours (super admin privilege required).");
        System.out.println("|-lib add member <FName> <LName> <PhoneNumber>   :Add a new member to the library (admin privilege required).");
        System.out.println("|-lib rent <bookName> <LName> <FName> <memberID> :Rent a book for a specific member.");
        System.out.println("|-lib get available books                        :View available books for rental.");
        System.out.println("|-lib remove member <memberID>                   :Remove a member from the library (admin privilege required).");
        System.out.println("|-lib return <bookName>                          :Return a rented book to the library.");
        System.out.println("|-Find user ID <FirstName> <LastName>            :To find ID if you forget it.");
        System.out.println("|-<panel>                                        :go to super admin panel");
        System.out.println("|-command help for line ?                        :example: help line 1");
        System.out.println("|");

        Library LibraryObject_CLI = new Library();
        CLIcommandSuperAdmin SuperAdminPanelIbject = new CLIcommandSuperAdmin();

        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.print("|->> ");
            String inputString = input.nextLine();
            inputString = inputString.trim();

            String[] inputStringArray;
            inputStringArray = inputString.split(" ");

            Pattern Line1 = Pattern.compile("^(lib)\\s+(add)\\s+(book)\\s*<([a-zA-Z\\sa-zA-z]+)>\\s*" +
                    "<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line2 = Pattern.compile("^(lib)\\s+(get)\\s+(hrs)", Pattern.CASE_INSENSITIVE);
            Pattern Line3 = Pattern.compile("^(lib)\\s+(add)\\s+(member)\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([0-9]{11})>",
                    Pattern.CASE_INSENSITIVE);
            Pattern Line4 = Pattern.compile("^(lib)\\s+(rent)\\s+<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z\\sa-zA-z]+)>\\s*<([a-zA-Z\\sa-zA-z]+)>" +
                    "\\s*<([0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line5 = Pattern.compile("^(lib)\\s+(get)\\s+(available)\\s+(books)", Pattern.CASE_INSENSITIVE);
            Pattern Line6 = Pattern.compile("^(lib)\\s+(remove)\\s+(member)\\s+<([0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line7 = Pattern.compile("^(lib)\\s+(return)\\s+<([a-zA-Z\\sa-zA-z]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line8 = Pattern.compile("^(Find)\\s+(user)\\s+(ID)\\s+<([a-zA-Z\\sa-zA-z]+)>\\s*" +
            "<([a-zA-Z0-9\\sa-zA-z0-9]+)>",Pattern.CASE_INSENSITIVE);
            Pattern Line9 = Pattern.compile("<panel>" , Pattern.CASE_INSENSITIVE);

            Matcher line1 = Line1.matcher(inputString);
            Matcher line2 = Line2.matcher(inputString);
            Matcher line3 = Line3.matcher(inputString);
            Matcher line4 = Line4.matcher(inputString);
            Matcher line5 = Line5.matcher(inputString);
            Matcher line6 = Line6.matcher(inputString);
            Matcher line7 = Line7.matcher(inputString);
            Matcher line8 = Line8.matcher(inputString);
            Matcher line9 = Line9.matcher(inputString);




            if (line1.find()){

                LibraryObject_CLI.add_book(line1.group(4),line1.group(5),line1.group(6));
                System.out.println("|-^-- accepted (L 1)");

            }
            else if (line2.matches()) {

                System.out.println("line 2 dorost");
            }

            else if (line3.find()) {

                LibraryObject_CLI.add_newUser(line3.group(4),line3.group(5),line3.group(6));
                System.out.println("|-^-- accepted (L 3)");
            }

            else if (line4.find()) {

                LibraryObject_CLI.Register_Rent(line4.group(3),line4.group(4) , line4.group(5),line4.group(6));
                System.out.println("|-^-- accepted (L 4)");

            }

            else if (line5.find()){

                System.out.println("|-^-- accepted (L 4)");
                System.out.println("|----------------------------------------------------------");
                LibraryObject_CLI.available();

            }

            else if (line6.find()) {

                System.out.println("line 6 dorost");
            }

            else if (line7.find()) {

                System.out.println("line 7 dorost");
            }

            else if (line8.find()){

                System.out.println("|-^-- accepted (L 4)");
                System.out.println("|----------------------------------------------------------");
                LibraryObject_CLI.NormalUserIdFinder(line8.group(4),line8.group(5));

            }

            else if (line9.find()){

                System.out.println("|----------------------------------------------------------");
                SuperAdminPanelIbject.SuperLogIn();

            }

            else
                System.out.println("|-! something went wrong , try again ");

        }

    }
}
