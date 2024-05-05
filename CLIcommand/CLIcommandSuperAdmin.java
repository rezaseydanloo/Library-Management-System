package CLIcommand;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CLIcommandSuperAdmin {

    clicommand startclicommand  = new clicommand();


    public void SuperCLI (){

        System.out.println("|---super admin log in page - ");
        System.out.println("|-- log in as super admin for running the program -");
        System.out.println("|-- <FirstName> <LastName> <Password> ");

        Pattern inputPattern = Pattern.compile("<reza>\\s*<seydanloo>\\s*<912138364761383>",Pattern.CASE_INSENSITIVE);
        Pattern inputAnswerPatternYes = Pattern.compile("yes",Pattern.CASE_INSENSITIVE);
        Pattern inputAnswerPatternNo = Pattern.compile("no",Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);

        while (true){


            System.out.print("|>> ");
            String  inputString = input.nextLine();
            Matcher inputMatcher = inputPattern.matcher(inputString);

            if (inputMatcher.find()){

                System.out.println("|- accepted ");
                System.out.println("----------------------------------------------------");

                startclicommand.cli();
            }

            else
                System.out.println("|-! something went wrong , try again ");

        }


    }

    public void SuperAdminPanel (){

        System.out.println("|---super admin panel -");
        System.out.println("|-- add admin                       : write <add>   ");
        System.out.println("|-- remove admin                    : write <remove>");
        System.out.println("|-- get hrs                         : write <hrs>   ");
        System.out.println("|-- go to cli (user command)        : write <cli>   ");

        Pattern AddPattern = Pattern.compile("add" , Pattern.CASE_INSENSITIVE);
        Pattern RemovePattern = Pattern.compile("remove" , Pattern.CASE_INSENSITIVE);
        Pattern HrsPattern = Pattern.compile("hrs" , Pattern.CASE_INSENSITIVE);
        Pattern CliPattern = Pattern.compile("cli" , Pattern.CASE_INSENSITIVE);

    }

}
