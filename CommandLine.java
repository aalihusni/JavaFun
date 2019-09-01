package encryptdecrypt;

import java.util.Scanner;

public class Main {

    // private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String operation = "";
        int key = 0;
        String text = "";

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    operation = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    text = args[i + 1];
                    break;
            }
        }
        String result = caesar(text, key, operation);
        System.out.println(result);
    }


    private static String caesar(String text, int key, String operation) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            if (operation.equals("enc")) {
                ascii = ascii + key;
            } else if (operation.equals("dec")) {
                ascii = ascii - key;
            }
            result = result + (char) ascii;
        }

        return result;
    }


}