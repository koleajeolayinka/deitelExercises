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
        System.out.print("enter a digit: ");
        int nokiaInput = scanner.nextInt();
// PHONE BOOK FUCTION LISTED BELOW
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
                switch (optionsFunction) {
                    case 8:
                        System.out.println("""
                                1 -> Type of view
                                2 -> Memory status
                                """);
                        break;
                }
                break;

            // MESSAGE FUNCTION

            case 2:
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
                switch (messageSettings) {

                    case 7:
                        System.out.println("""
                                1 -> Set 1^2
                                2 -> Common ^3
                                """);

                        int set1function = scanner.nextInt();
                        switch (set1function) {

                            case 1:
                                System.out.println("""
                                         1. Message centre number
                                             2. Messages sent as
                                             3. Message validity
                                        """);
                                int common = scanner.nextInt();


                            case 2:
                                System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                break;


                        }
                        break;

                    case 3:
                        System.out.println("""
                                Chat 
                                """);
                }
                        break;



                    case 4:
                        System.out.println("""
                                1 -> Missed calls
                                2 -> Received calls
                                3 -> Dialled numbers
                                4 -> Erase recent call list
                                5 -> Show call duration
                                6 -> Show call cose
                                7 -> Call cost settings
                                8 -> Prepaid credit
                                """);
                        int ShowCallDuration = scanner.nextInt();

                        switch (ShowCallDuration) {
                            case 5:
                                System.out.println("""
                                        1. Last call duration
                                        2. All calls' duration
                                        3. Clear counters
                                        """);
                                int ShowCallCost = scanner.nextInt();
                            case 6:
                                System.out.println("""
                                        1. Last call cost
                                        2. All calls' cost
                                        3. Clear counters
                                        """);
                                int callCostSettings = scanner.nextInt();
                            case 7:
                                System.out.println("""
                                        1. Call cost limit
                                        2. Show cost in
                                        """);

                        }
                        break;



                            case 5:
                                System.out.println("""
                                        1 -> Ringing tone
                                        2 -> Ringing volume
                                        3 -> Incoming call alert
                                        4 -> Composer
                                        5 -> Message alert tone
                                        6 -> keypad tones
                                        7 -> Warning and game tones
                                        8 -> vibrating alert
                                        9 -> Screen saver
                                        """);
                                break;
                        }
                        switch (nokiaInput) {
                            case 6:
                                System.out.println("""
                                        1 -> Call settings
                                        2 -> Phone settings
                                        3 -> Security settings
                                        4 -> Restore factory settings
                                        """);
                                int callSettings = scanner.nextInt();

                                switch (nokiaInput) {
                                    case 1:
                                        System.out.println("""
                                                1. Automatic redial
                                                2. Speed dialling
                                                3. Call waiting options
                                                4. Own number sending
                                                5. Phone line in use
                                                6. Automatic answer
                                                """);
                                        int phoneSetting = scanner.nextInt();
                                    case 2:
                                        System.out.println("""
                                                1. language
                                                2. Cell info display
                                                3. Welcome note
                                                4. Network seletion
                                                5. light 
                                                6. Confirm SIM service actions
                                                """);
                                        int securitySetting = scanner.nextInt();
                                    case 3:
                                        System.out.println("""
                                                1. PIN code request
                                                2. Call barring service
                                                3. Fixed dialling
                                                4. Closed user group
                                                5. Phone security 
                                                6. Change access codes
                                                """);
                                }
                                break;
                        }
                        switch (nokiaInput) {
                            case 7:
                                System.out.println("""
                                        Call divert
                                        """);
                                break;
                        }
                        switch (nokiaInput) {
                            case 8:
                                System.out.println("""
                                        Games
                                        """);
                        }
                        switch (nokiaInput) {
                            case 9:
                                System.out.println("""
                                        calculator
                                        """);
                        }
                        switch (nokiaInput) {
                            case 10:
                                System.out.println("""
                                        Reminder
                                        """);
                        }
                        switch (nokiaInput) {
                            case 11:
                                System.out.println("""
                                        1 -> Alarm clock 
                                        2 -> Clock settings
                                        3 -> Date setting
                                        4 -> Stopwatch
                                        5 -> Countdown timer
                                        6 -> Auto update of date and time
                                        """);
                                break;

                        }
                        switch (nokiaInput) {
                            case 12:
                                System.out.println("""
                                        Profiles
                                        """);
                                break;

                        }
                        switch (nokiaInput) {
                            case 13:
                                System.out.println("""
                                        SIM services ^3
                                        """);
                        }
                }
        }

