package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String result = "";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = scanner.nextInt();

        for (int i = 0; i < text.length(); i++) {
            char alphabet = text.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + key);

                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                result = result + alphabet;
            } else {
                result = result + alphabet;
            }
        }

        System.out.println(result);
    }
}