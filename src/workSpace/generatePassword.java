 package workSpace;
 import java.util.Random;

 public class generatePassword {
    public static void main(String[] args) {
        Random numberRandom = new Random();
        char [] generatedPassword = new char[26];
        int randNumberGenerated;

               String number ="123456789123456789012345679";
               String up= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
               String lw = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 4; i++) {
            randNumberGenerated = 1+numberRandom.nextInt(26);
            System.out.print(generatedPassword[i] = number.charAt(randNumberGenerated));
            System.out.print(generatedPassword[i] = up.charAt(randNumberGenerated));
            System.out.print(generatedPassword[i] = lw.charAt(randNumberGenerated));

        }



//
//        }
//
//        for (i = 0; i >= 9; i++) {
//            System.out.println(PasswordNumber[i] + " ");
//
//        }
//         char[] up = new char[26];
//        up[0] = 'A';
//        up[1] = 'B';
//        up[2] = 'C';
//        up[3] = 'D';
//        up[4] = 'E';
//        up[5] = 'F';
//        up[6] = 'G';
//        up[7] = 'H';
//        up[8] = 'I';
//        up[9] = 'J';
//        up[10] ='K';
//        up[11] = 'L';
//        up[12] = 'M';
//        up[13] = 'N';
//        up[14] = 'O';
//        up[15] = 'P';
//        up[16] = 'Q';
//        up[17] = 'R';
//        up[18] = 'S';
//        up[19] = 'T';
//        up[20] = 'U';
//        up[21] = 'W';
//        up[22] = '';
//        up[23] = 'A';
//        up[24] = 'A';
//        up[25] = 'A';
//        up[26] = 'A';
//


    }
}
