package CLIcommand;

public class start {
    public static void main(String[] args) {

        CLI startclicommand  = new CLI();
        CLIcommandSuperAdmin startsuperclicommand = new CLIcommandSuperAdmin();

        startsuperclicommand.SuperLogIn();
        startclicommand.cli();


    }
}
