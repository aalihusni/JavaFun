package encryptdecrypt;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enc");
        String text = sc.nextLine();
        int key = sc.nextInt();
        sc.nextLine();
        encrypt(text,key);
        System.out.println("dec");
        String text2 = sc.nextLine();
        int key2 = sc.nextInt();
        decrypt(text2,key2);
        sc.close();
    }


    private static void encrypt(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            ascii = ascii + key;
            result = result + (char) ascii;
        }

        System.out.println(result);
    }

    private static void decrypt(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            ascii = ascii - key;
            result = result + (char) ascii;
        }

        System.out.println(result);
    }
}