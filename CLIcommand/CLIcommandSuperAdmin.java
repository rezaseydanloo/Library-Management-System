package CLIcommand;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CLIcommandSuperAdmin {

    clicommand startclicommand  = new clicommand();


    public void SuperCLI (){

        System.out.println("|-----super admin log in page ");
        System.out.println("|-- description : log in as super admin for running the program ");
        System.out.println("|-- <FirstName> <LastName> <Password> ");

        Pattern inputPattern = Pattern.compile("<reza>\\s*<seydanloo>\\s*<912138364761383>",Pattern.CASE_INSENSITIVE);
        Pattern inputAnswerPatternYes = Pattern.compile("yes",Pattern.CASE_INSENSITIVE);
        Pattern inputAnswerPatternNo = Pattern.compile("no",Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("|>> ");
            String  inputString = input.nextLine();
            Matcher inputMatcher = inputPattern.matcher(inputString);

            if (inputMatcher.find()) {

                System.out.println("|-^-- accepted ");
                System.out.println("|----------------------------------------------------");
                System.out.println("|-----option ");
                System.out.println("|-1- go to cli (user command)      : <cli>");
                System.out.println("|-2- go to super admin panel       : <panel>");

                Pattern pattern1 = Pattern.compile("<cli>", Pattern.CASE_INSENSITIVE);
                Pattern pattern2 = Pattern.compile("<panel>", Pattern.CASE_INSENSITIVE);

                while (true) {
                    System.out.print("|>> ");
                    inputString = input.nextLine();

                    Matcher matcher1 = pattern1.matcher(inputString);
                    Matcher matcher2 = pattern2.matcher(inputString);


                    if (matcher1.find()) {

                        System.out.println("|----------------------------------------------------");
                        startclicommand.cli();

                    }

                    else if (matcher2.find()) {

                        System.out.println("|----------------------------------------------------");
                        SuperAdminPanel();
                    }

                    else
                        System.out.println("|-! something went wrong , try again ");


                }
            }

            else
                System.out.println("|-! something went wrong , try again ");

        }


    }

    public void SuperAdminPanel (){

        System.out.println("|-----super admin panel ");
        System.out.println("|-- add admin                       : <add>   ");
        System.out.println("|-- remove admin                    : <remove>");
        System.out.println("|-- get hrs                         : <hrs>   ");
        System.out.println("|-- go to cli (user command)        : <cli>   ");

        Pattern AddPattern = Pattern.compile("add" , Pattern.CASE_INSENSITIVE);
        Pattern RemovePattern = Pattern.compile("remove" , Pattern.CASE_INSENSITIVE);
        Pattern HrsPattern = Pattern.compile("hrs" , Pattern.CASE_INSENSITIVE);
        Pattern CliPattern = Pattern.compile("cli" , Pattern.CASE_INSENSITIVE);


    }

}
