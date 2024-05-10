package CLIcommand;

import Library.Library;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CLI {

    Library LibraryObject_CLI = new Library();

    //------------------------------------------------------------------------------------------------------------------

    public void cli() {

        CLIcommandSuperAdmin SuperAdminPanelObject = new CLIcommandSuperAdmin();

        Date date = new Date();

        System.out.println("|-----cli -- " + "| "+ date.toString() +  " | " + "8:00 - "+ LibraryObject_CLI.getH() + ":" + LibraryObject_CLI.getM());
        System.out.println("|-lib add book <name> <author> <Description>     :Add a new book to the library.");
        System.out.println("|-lib get hrs <hh:mm>                            :Retrieve library operating hours (admin privilege required).");
        System.out.println("|-lib add member <FName> <LName> <PhoneNumber>   :Add a new member to the library (admin privilege required).");
        System.out.println("|-lib rent <bookName> <LName> <FName> <memberID> :Rent a book for a specific member.");
        System.out.println("|-lib get available books                        :View available books for rental.");
        System.out.println("|-lib remove member <memberID>                   :Remove a member from the library (admin privilege required).");
        System.out.println("|-lib return <bookName>                          :Return a rented book to the library.");
        System.out.println("|-Find user ID <FirstName> <LastName>            :To find ID if you forget it.");
        System.out.println("|-<panel>                                        :go to super admin panel");
        System.out.println("|-command help for line ?                        :example: help line 1");
        System.out.println("|");


        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.print("|->> ");
            String inputString = input.nextLine();
            inputString = inputString.trim();

            String[] inputStringArray;
            inputStringArray = inputString.split(" ");

            Pattern Line1 = Pattern.compile("^(lib)\\s+(add)\\s+(book)\\s*<([a-zA-Z\\sa-zA-z]+)>\\s*" +
                    "<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line2 = Pattern.compile("^(lib)\\s+(get)\\s+(hrs)\\s*<([0-9]{1,2}):([0-9]{1,2})>\\s*", Pattern.CASE_INSENSITIVE);
            Pattern Line3 = Pattern.compile("^(lib)\\s+(add)\\s+(member)\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([0-9]{11})>",
                    Pattern.CASE_INSENSITIVE);
            Pattern Line4 = Pattern.compile("^(lib)\\s+(rent)\\s+<([a-zA-Z0-9\\sa-zA-z0-9]+)>\\s*<([a-zA-Z\\sa-zA-z]+)>\\s*<([a-zA-Z\\sa-zA-z]+)>" +
                    "\\s*<([0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line5 = Pattern.compile("^(lib)\\s+(get)\\s+(available)\\s+(books)", Pattern.CASE_INSENSITIVE);
            Pattern Line6 = Pattern.compile("^(lib)\\s+(remove)\\s+(member)\\s+<([0-9]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line7 = Pattern.compile("^(lib)\\s+(return)\\s+<([a-zA-Z\\sa-zA-z]+)>", Pattern.CASE_INSENSITIVE);
            Pattern Line8 = Pattern.compile("^(find)\\s+(user)\\s+(id)\\s*<([a-zA-Z\\sa-zA-z]+)>\\s*" +
                    "<([a-zA-Z\\sa-zA-z]+)>\\s*",Pattern.CASE_INSENSITIVE);
            Pattern Line9 = Pattern.compile("<panel>" , Pattern.CASE_INSENSITIVE);

            Pattern AdminLogIn = Pattern.compile("<([a-zA-Z\\sa-zA-Z]+)>\\s*<([a-zA-Z\\sa-zA-Z]+)>\\s*<([a-zA-Z0-9]+)>");
            Pattern CliPattern = Pattern.compile("<cli>" , Pattern.CASE_INSENSITIVE);


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

                if ((Integer.parseInt(line2.group(4)))<24 && (Integer.parseInt(line2.group(4)))>=0){

                    if ((Integer.parseInt(line2.group(5)))>=0 && (Integer.parseInt(line2.group(5)))<60){

                        System.out.println("|----------------------------------------------------------");
                        System.out.println("|-!! notice : at first admin should log in <first..> <last..> <pas..>");
                        System.out.println("|--- <cli>");


                        while (true){


                            System.out.print("|->> ");
                            inputString=input.nextLine();
                            inputString=inputString.trim();
                            Matcher adminLogIn = AdminLogIn.matcher(inputString);
                            Matcher Cli = CliPattern.matcher(inputString);

                            if (adminLogIn.find()){

                                if (LibraryObject_CLI.AdminSupervision(adminLogIn.group(1),adminLogIn.group(2),adminLogIn.group(3))){

                                    System.out.println("|-^-- accepted (Admin log in successfully)");
                                    LibraryObject_CLI.setH(Integer.parseInt(line2.group(4)));
                                    LibraryObject_CLI.setM(Integer.parseInt(line2.group(5)));
                                    System.out.println("|-^-- accepted (L 2)(the working hours was set)");
                                    break;
                                }

                            }

                            else if (Cli.find()){

                                System.out.println("|----------------------------------------------------------");
                                cli();

                            }

                            else
                                System.out.println("|-! something went wrong , try again ");
                        }
                    }

                    else
                        System.out.println("|-! something went wrong , try again ");

                }

                else
                    System.out.println("|-! something went wrong , try again ");



            }


            else if (line3.find()) {


                System.out.println("|----------------------------------------------------------");
                System.out.println("|-!! notice : at first admin should log in <first..> <last..> <pas..>");

                while (true){


                    System.out.print("|->> ");
                    inputString=input.nextLine();
                    inputString=inputString.trim();
                    Matcher adminLogIn = AdminLogIn.matcher(inputString);

                    if (adminLogIn.find()){

                        if (LibraryObject_CLI.AdminSupervision(adminLogIn.group(1),adminLogIn.group(2),adminLogIn.group(3))){

                            System.out.println("|-^-- accepted (Admin log in successfully)");
                            LibraryObject_CLI.add_newUser(line3.group(4),line3.group(5),line3.group(6));
                            System.out.println("|-^-- accepted (L 3)");
                            break;
                        }

                    }

                    else
                        System.out.println("|-! something went wrong , try again ");

                }
            }



            else if (line4.find()) {

                LibraryObject_CLI.Register_Rent(line4.group(3),line4.group(4) , line4.group(5),line4.group(6));
                System.out.println("|-^-- accepted (L 4)");

            }

            else if (line5.find()){

                System.out.println("|-^-- accepted (L 5)");
                System.out.println("|----------------------------------------------------------");
                LibraryObject_CLI.available();

            }

            else if (line6.find()) {

                System.out.println("|-^-- accepted (L 6)");
                LibraryObject_CLI.RemoveMember(Integer.parseInt(line6.group(4)));
            }

            else if (line7.find()) {

                LibraryObject_CLI.ReturnBook(line7.group(3));
                System.out.println("|-^-- accepted (L 7)");
            }

            else if (line8.find()){

                System.out.println("|-^-- accepted (L 8)");
                System.out.println("|-----------------------------------------------------------");
                LibraryObject_CLI.NormalUserIdFinder(line8.group(4),line8.group(5));

            }

            else if (line9.find()){

                System.out.println("|-----------------------------------------------------------");
                SuperLogIn();

            }

            else
                System.out.println("|-! something went wrong , try again ");

        }

    }

//----------------------------------------------------------------------------------------------------------------------


    public void SuperLogIn(){

        System.out.println("|-----super admin log in page ");
        System.out.println("|-- description : log in as super admin for running the program ");
        System.out.println("|-- <FirstName> <LastName> <Password> ");
        System.out.println("|-- <cli>");

        Pattern inputPattern = Pattern.compile("<reza>\\s*<seydanloo>\\s*<912138364761383>",Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);

        Pattern cliPattern = Pattern.compile("<cli>" , Pattern.CASE_INSENSITIVE);


        while (true){

            System.out.print("|->> ");
            String  inputString = input.nextLine();
            Matcher inputMatcher = inputPattern.matcher(inputString);
            Matcher cliMatcher = cliPattern.matcher(inputString);

            if (inputMatcher.find()) {

                System.out.println("|-^-- accepted ");
                System.out.println("|----------------------------------------------------------");
                System.out.println("|-----option ");
                System.out.println("|-1- go to cli (user command)      : <cli>");
                System.out.println("|-2- go to super admin panel       : <panel>");

                Pattern pattern1 = Pattern.compile("<cli>", Pattern.CASE_INSENSITIVE);
                Pattern pattern2 = Pattern.compile("<panel>", Pattern.CASE_INSENSITIVE);

                while (true) {
                    System.out.print("|->> ");
                    inputString = input.nextLine();

                    Matcher matcher1 = pattern1.matcher(inputString);
                    Matcher matcher2 = pattern2.matcher(inputString);


                    if (matcher1.find()) {

                        System.out.println("|----------------------------------------------------------");
                        cli();

                    }

                    else if (matcher2.find()) {

                        System.out.println("|----------------------------------------------------------");
                        SuperAdminPanel();
                    }

                    else
                        System.out.println("|-! something went wrong , try again ");


                }
            }

            else if (cliMatcher.find()) {

                System.out.println("|----------------------------------------------------------");
                cli();

            }


            else
                System.out.println("|-! something went wrong , try again ");

        }


    }

    //------------------------------------------------------------------------------------------------------------------


    public void SuperAdminPanel (){

        System.out.println("|-----super admin panel ");
        System.out.println("|-- add admin                       : <NewAdminFirstName> <..LastName> <Password>   ");
        System.out.println("|-- remove admin                    : <AdminID>");
        //System.out.println("|-- get hrs                         : <hrs>   ");
        System.out.println("|-- admins list Name , Id           : <list>  ");
        System.out.println("|-- Library capacity                : capacity <...>");
        System.out.println("|-- go to cli (user command)        : <cli>   ");


        Pattern AddPattern = Pattern.compile("<([a-zA-Z\\sa-zA-Z]+)>\\s*<([a-zA-Z\\sa-zA-Z]+)>\\s*<([a-zA-Z0-9]+)>" , Pattern.CASE_INSENSITIVE);
        Pattern RemovePattern = Pattern.compile("<([0-9]{3,10})>" , Pattern.CASE_INSENSITIVE);
        Pattern HrsPattern = Pattern.compile("hrs" , Pattern.CASE_INSENSITIVE);
        Pattern CliPattern = Pattern.compile("cli" , Pattern.CASE_INSENSITIVE);
        Pattern ListPattern = Pattern.compile("list" , Pattern.CASE_INSENSITIVE);
        Pattern CapacityPattern = Pattern.compile("(capacity)\\s*<([0-9]{1,4})>\\s*");

        Scanner input = new Scanner(System.in);


        while (true){

            System.out.print("|->> ");

            String inputString = input.nextLine();

            Matcher AddMatcher = AddPattern.matcher(inputString);
            Matcher RemoveMatcher = RemovePattern.matcher(inputString);
            Matcher HrsMatcher = HrsPattern.matcher(inputString);
            Matcher CliMatcher = CliPattern.matcher(inputString);
            Matcher ListMatcher = ListPattern.matcher(inputString);
            Matcher CapacityMatcher = CapacityPattern.matcher(inputString);


            if (AddMatcher.find()){



                LibraryObject_CLI.add_admin(AddMatcher.group(1),AddMatcher.group(2),AddMatcher.group(3));
                System.out.println("|-^-- accepted (admin Added)");

            }

            else if (RemoveMatcher.find()) {

                LibraryObject_CLI.RemoveAdmin(Integer.parseInt(RemoveMatcher.group(1)));
                System.out.println("|----------------------------------------------------------");

            }

            else if (HrsMatcher.find()) {


            }

            else if (CliMatcher.find()) {

                System.out.println("|----------------------------------------------------------");
                cli();

            }

            else if (ListMatcher.find()){

                System.out.println("|----------------------------------------------------------");
                LibraryObject_CLI.AdminIdFinder();

            }

            else if (CapacityMatcher.find()){

                LibraryObject_CLI.setCapacity(Integer.parseInt(CapacityMatcher.group(2)));

            }

            else
                System.out.println("|-! something went wrong , try again ");


        }


    }

}
