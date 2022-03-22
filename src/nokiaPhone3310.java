import java.util.Scanner;

public class nokiaPhone3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1 -> Phone book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminder
                11 -> Clock
                12 -> Profiles
                13 -> SIM services ^3
                """);
        System.out.println("enter a digit");
        int nokiaInput = scanner.nextInt();

        switch (nokiaInput) {
            case 1:
                System.out.println("""
                        1. Search
                        2. ServiceNos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """);
                int optionsFunction = scanner.nextInt();
            case 8:
                System.out.println("""
                        1 -> Type of view
                        2 -> Memory status
                        """);
                break;

        }
        switch (nokiaInput) {
            case 2 :
                System.out.println("""
                        1. Write messages
                        2. inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """);
                int messageSettings = scanner.nextInt();
            case 7:
                System.out.println("""
                        1 -> Set 1^2
                        2 -> Common ^3
                        """);
                int set1function = scanner.nextInt();
            case 1:
                System.out.println("""
                         1. Message centre number
                             2. Messages sent as
                             3. Message validity
                        """);



        }
    }
}